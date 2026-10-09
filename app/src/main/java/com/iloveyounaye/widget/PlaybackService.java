package com.iloveyounaye.widget;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class PlaybackService extends Service {
    public static final String ACTION_PLAY = "com.iloveyounaye.widget.PLAY";
    public static final String ACTION_STOP = "com.iloveyounaye.widget.STOP";
    private static final String CHANNEL = "naye_audio";
    private static final int NOTIFICATION_ID = 11;
    private MediaPlayer player;
    private AudioManager audioManager;
    private AudioFocusRequest focusRequest;
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
        // The widget PendingIntent represents a user tap. Never launch an Activity here.
        startForeground(NOTIFICATION_ID, buildNotification());
        playFromBeginning();
        return START_NOT_STICKY;
    }

    private Notification buildNotification() {
        Intent stopIntent = new Intent(this, PlaybackService.class).setAction(ACTION_STOP);
        PendingIntent stop = PendingIntent.getService(this, 2, stopIntent,
            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        return new Notification.Builder(this, CHANNEL)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("나예 사랑해 ♡")
            .setContentText("음성 재생 중")
            .setOngoing(true)
            .setShowWhen(false)
            .setCategory(Notification.CATEGORY_TRANSPORT)
            .addAction(new Notification.Action.Builder(
                R.drawable.ic_notification, "정지", stop).build())
            .build();
    }

    private File getAudioFile() throws Exception {
        File file = new File(getFilesDir(), "voice.m4a");
        if (file.exists() && file.length() > 0) return file;
        // GitHub stores the short audio as a text asset; decode it on first play.
        byte[] encoded;
        try (InputStream input = getAssets().open("voice.b64")) {
            encoded = input.readAllBytes();
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

    private void playFromBeginning() {
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
                stopSelf();
                return;
            }
            MediaPlayer newPlayer = new MediaPlayer();
            player = newPlayer;
            newPlayer.setAudioAttributes(attributes);
            newPlayer.setDataSource(getAudioFile().getAbsolutePath());
            newPlayer.setOnCompletionListener(mp -> stopSelf());
            newPlayer.setOnErrorListener((mp, what, extra) -> {
                stopSelf();
                return true;
            });
            newPlayer.prepare();
            newPlayer.start();
        } catch (Exception e) {
            Log.e("NayeLove", "Audio playback failed", e);
            stopSelf();
        }
    }

    @Override public void onDestroy() {
        releasePlayer();
        super.onDestroy();
    }

    @Override public IBinder onBind(Intent intent) { return null; }
}
