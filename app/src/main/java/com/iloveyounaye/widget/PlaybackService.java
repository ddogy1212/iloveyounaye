package com.iloveyounaye.widget;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class PlaybackService extends Service {
    public static final String ACTION_PLAY = "com.iloveyounaye.widget.PLAY";
    public static final String ACTION_STOP = "com.iloveyounaye.widget.STOP";
    public static final String ACTION_PREVIEW_ORIGINAL = "com.iloveyounaye.widget.PREVIEW_ORIGINAL";
    public static final String ACTION_PREVIEW_SECONDARY = "com.iloveyounaye.widget.PREVIEW_SECONDARY";

    private static final String CHANNEL = "naye_audio";
    private static final int NOTIFICATION_ID = 11;
    private static final String PREFS = "voice_sequence_v8";
    private static final String NEXT_SECONDARY = "next_secondary";
    private static final String SECOND_VOICE_FILE = "voice_secondary.m4a";

    private MediaPlayer player;
    private AudioManager audioManager;
    private AudioFocusRequest focusRequest;

    public static boolean hasSecondaryVoice(Context context) {
        File file = new File(context.getFilesDir(), SECOND_VOICE_FILE);
        return file.isFile() && file.length() > 0;
    }

    public static void resetTapSequence(Context context) {
        context.getSharedPreferences(PREFS, MODE_PRIVATE)
            .edit().putBoolean(NEXT_SECONDARY, false).apply();
    }

    private final AudioManager.OnAudioFocusChangeListener focusListener = focus -> {
        if (focus == AudioManager.AUDIOFOCUS_LOSS) stopSelf();
        else if (focus == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT && player != null && player.isPlaying()) player.pause();
        else if (focus == AudioManager.AUDIOFOCUS_GAIN && player != null && !player.isPlaying()) player.start();
    };

    @Override public void onCreate() {
        super.onCreate();
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        NotificationManager notifications = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notifications.createNotificationChannel(new NotificationChannel(
            CHANNEL, "나예 사랑해 재생", NotificationManager.IMPORTANCE_LOW));
    }

    @Override public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && ACTION_STOP.equals(intent.getAction())) {
            stopSelf();
            return START_NOT_STICKY;
        }
        if (intent == null) return START_NOT_STICKY;

        String action = intent.getAction();
        boolean useSecondary;
        if (ACTION_PREVIEW_ORIGINAL.equals(action)) {
            useSecondary = false;
        } else if (ACTION_PREVIEW_SECONDARY.equals(action)) {
            if (!hasSecondaryVoice(this)) {
                stopSelf();
                return START_NOT_STICKY;
            }
            useSecondary = true;
        } else if (ACTION_PLAY.equals(action)) {
            // Only widget taps advance the alternating sequence. Previews do not.
            if (hasSecondaryVoice(this)) {
                SharedPreferences preferences = getSharedPreferences(PREFS, MODE_PRIVATE);
                useSecondary = preferences.getBoolean(NEXT_SECONDARY, false);
                preferences.edit().putBoolean(NEXT_SECONDARY, !useSecondary).commit();
            } else {
                useSecondary = false;
                resetTapSequence(this);
            }
        } else {
            stopSelf();
            return START_NOT_STICKY;
        }

        // The widget PendingIntent represents a user tap. Never open an Activity.
        startForeground(NOTIFICATION_ID, buildNotification(useSecondary));
        playFromBeginning(useSecondary, startId);
        return START_NOT_STICKY;
    }

    private Notification buildNotification(boolean secondary) {
        Intent stopIntent = new Intent(this, PlaybackService.class).setAction(ACTION_STOP);
        PendingIntent stop = PendingIntent.getService(this, 2, stopIntent,
            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        return new Notification.Builder(this, CHANNEL)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("음성위젯 ♡")
            .setContentText(secondary ? "두 번째 음성 재생 중" : "원래 음성 재생 중")
            .setOngoing(true)
            .setShowWhen(false)
            .setCategory(Notification.CATEGORY_TRANSPORT)
            .addAction(new Notification.Action.Builder(
                R.drawable.ic_notification, "정지", stop).build())
            .build();
    }

    private File getOriginalAudioFile() throws Exception {
        File file = new File(getFilesDir(), "voice.m4a");
        if (file.exists() && file.length() > 0) return file;
        // Original recording stays in the existing GitHub asset.
        byte[] encoded;
        try (InputStream input = getAssets().open("voice.b64");
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
            byte[] chunk = new byte[8192];
            int count;
            while ((count = input.read(chunk)) != -1) buffer.write(chunk, 0, count);
            encoded = buffer.toByteArray();
        }
        byte[] audio = Base64.decode(encoded, Base64.DEFAULT);
        try (FileOutputStream output = new FileOutputStream(file)) {
            output.write(audio);
        }
        return file;
    }

    private void releasePlayer() {
        if (player != null) {
            try { player.stop(); } catch (IllegalStateException ignored) { }
            player.release();
            player = null;
        }
        if (focusRequest != null && audioManager != null) {
            audioManager.abandonAudioFocusRequest(focusRequest);
            focusRequest = null;
        }
    }

    private void playFromBeginning(boolean secondary, int startId) {
        releasePlayer();
        try {
            AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();
            focusRequest = new AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT)
                .setAudioAttributes(attributes)
                .setOnAudioFocusChangeListener(focusListener)
                .build();
            int focus = audioManager.requestAudioFocus(focusRequest);
            if (focus != AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                stopSelf(startId);
                return;
            }
            MediaPlayer nextPlayer = new MediaPlayer();
            player = nextPlayer;
            nextPlayer.setAudioAttributes(attributes);
            File file = secondary ? new File(getFilesDir(), SECOND_VOICE_FILE) : getOriginalAudioFile();
            nextPlayer.setDataSource(file.getAbsolutePath());
            nextPlayer.setOnCompletionListener(mp -> stopSelf(startId));
            nextPlayer.setOnErrorListener((mp, what, extra) -> {
                Log.e("NayeLove", "Audio player error: " + what + " / " + extra);
                stopSelf(startId);
                return true;
            });
            nextPlayer.prepare();
            nextPlayer.start();
        } catch (Exception e) {
            Log.e("NayeLove", "Audio playback failed", e);
            stopSelf(startId);
        }
    }

    @Override public void onDestroy() {
        releasePlayer();
        super.onDestroy();
    }

    @Override public IBinder onBind(Intent intent) { return null; }
}
