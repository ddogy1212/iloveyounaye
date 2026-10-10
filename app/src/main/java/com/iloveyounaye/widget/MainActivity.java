package com.iloveyounaye.widget;

import android.Manifest;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.InputStream;

public final class MainActivity extends Activity {
    private static final int PICK_PHOTO = 410;
    private CropPreview cropPreview;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        if (Build.VERSION.SDK_INT >= 33 &&
                checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 12);
        }

        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setBackgroundColor(0xfffff7fb);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(24), dp(20), dp(28));
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        scroll.addView(root);

        TextView title = new TextView(this);
        title.setText("음성위젯 ♡");
        title.setTextSize(26);
        title.setTextColor(0xff34202e);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(-1, -2));

        TextView instructions = new TextView(this);
        instructions.setText("사진을 골라 1×1 위젯에 표시할 영역을 조절하세요.\n손가락으로 이동하고, 두 손가락으로 확대·축소할 수 있어요.");
        instructions.setTextSize(14);
        instructions.setTextColor(0xff78596b);
        instructions.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams infoLp = new LinearLayout.LayoutParams(-1,-2);
        infoLp.setMargins(0, dp(8), 0, dp(16));
        root.addView(instructions, infoLp);

        cropPreview = new CropPreview(this);
        cropPreview.setAspectRatio(getLauncherWidgetAspect());
        cropPreview.setPhoto(LoveWidgetProvider.getSavedOrDefaultPhoto(this));
        root.addView(cropPreview, new LinearLayout.LayoutParams(-1,-2));

        TextView caption = new TextView(this);
        caption.setText("이 둥근 틀에 표시되는 영역이 위젯에 적용돼요. 사진이 빈틈없이 채워져요.");
        caption.setTextSize(12);
        caption.setTextColor(0xff917987);
        caption.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams capLp = new LinearLayout.LayoutParams(-1,-2);
        capLp.setMargins(0,dp(7),0,dp(16));
        root.addView(caption,capLp);

        Button choose = button("사진 선택하기", 0xffec4c8c, Color.WHITE);
        root.addView(choose, new LinearLayout.LayoutParams(-1,dp(52)));
        choose.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivityForResult(intent,PICK_PHOTO);
        });

        Button apply = button("✓ 이 사진과 범위로 위젯 적용", 0xffe9cee0, 0xff48283a);
        LinearLayout.LayoutParams applyLp = new LinearLayout.LayoutParams(-1,dp(52));
        applyLp.setMargins(0,dp(10),0,0);
        root.addView(apply,applyLp);
        apply.setOnClickListener(v -> {
            if (cropPreview.getPhoto() == null) {
                Toast.makeText(this,"사진을 먼저 선택해 주세요",Toast.LENGTH_SHORT).show();
                return;
            }
            try {
                Bitmap result = cropPreview.renderWidgetBitmap();
                LoveWidgetProvider.saveAndUpdate(this,result);
                result.recycle();
                Toast.makeText(this,"홈 화면 위젯 사진 적용 완료 ♡",Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Toast.makeText(this,"사진 저장에 실패했어요. 다시 시도해 주세요.",Toast.LENGTH_LONG).show();
            }
        });

        Button reset = button("기본 사진으로 돌아가기", 0xfff3e8ef, 0xff77596b);
        LinearLayout.LayoutParams resetLp = new LinearLayout.LayoutParams(-1,dp(46));
        resetLp.setMargins(0,dp(10),0,0);
        root.addView(reset,resetLp);
        reset.setOnClickListener(v -> {
            cropPreview.setPhoto(BitmapFactory.decodeResource(getResources(),R.drawable.widget_photo));
            try {
                LoveWidgetProvider.clearPhotoAndUpdate(this);
                Toast.makeText(this,"기본 사진으로 복원했어요",Toast.LENGTH_SHORT).show();
            } catch (Exception e) { Toast.makeText(this,"초기화 실패",Toast.LENGTH_SHORT).show(); }
        });

        Button widget = button("♡ 홈 화면에 1×1 위젯 추가", 0xffec4c8c, Color.WHITE);
        LinearLayout.LayoutParams widgetLp = new LinearLayout.LayoutParams(-1,dp(52));
        widgetLp.setMargins(0,dp(19),0,0);
        root.addView(widget,widgetLp);
        widget.setOnClickListener(v -> {
            AppWidgetManager manager = AppWidgetManager.getInstance(this);
            ComponentName provider = new ComponentName(this,LoveWidgetProvider.class);
            if (manager.isRequestPinAppWidgetSupported()) {
                manager.requestPinAppWidget(provider,null,null);
            } else {
                Toast.makeText(this,"홈 화면 빈 곳 길게 누르기 → 위젯 → 음성위젯",Toast.LENGTH_LONG).show();
            }
        });

        Button play = button("▶ 새 음성 미리 듣기", 0xfff8e0ec, 0xffcf3271);
        LinearLayout.LayoutParams playLp = new LinearLayout.LayoutParams(-1,dp(52));
        playLp.setMargins(0,dp(10),0,0);
        root.addView(play,playLp);
        play.setOnClickListener(v -> {
            Intent audio = new Intent(this,PlaybackService.class).setAction(PlaybackService.ACTION_PLAY);
            startForegroundService(audio);
        });
        setContentView(scroll);
    }

    @Override protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode != PICK_PHOTO || resultCode != RESULT_OK || data == null || data.getData() == null) return;
        try {
            Bitmap photo = decodePhoto(data.getData());
            if (photo == null) throw new IllegalArgumentException("empty image");
            cropPreview.setPhoto(photo);
            Toast.makeText(this,"확대·이동 후 '위젯 적용'을 눌러 주세요",Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this,"사진을 열 수 없어요. 다른 사진을 선택해 주세요.",Toast.LENGTH_LONG).show();
        }
    }

    private Bitmap decodePhoto(Uri uri) throws Exception {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try (InputStream in = getContentResolver().openInputStream(uri)) { BitmapFactory.decodeStream(in,null,options); }
        if (options.outWidth <= 0 || options.outHeight <= 0) throw new IllegalArgumentException("not an image");
        int sample = 1;
        while (Math.max(options.outWidth,options.outHeight)/sample > 1600) sample *= 2;
        options.inJustDecodeBounds = false;
        options.inSampleSize = sample;
        Bitmap photo;
        try (InputStream in = getContentResolver().openInputStream(uri)) { photo = BitmapFactory.decodeStream(in,null,options); }
        if (photo == null) throw new IllegalArgumentException("cannot decode image");
        try (InputStream in = getContentResolver().openInputStream(uri)) {
            ExifInterface exif = new ExifInterface(in);
            int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            Matrix rotation = new Matrix();
            switch (orientation) {
                case ExifInterface.ORIENTATION_ROTATE_90: rotation.postRotate(90); break;
                case ExifInterface.ORIENTATION_ROTATE_180: rotation.postRotate(180); break;
                case ExifInterface.ORIENTATION_ROTATE_270: rotation.postRotate(270); break;
                case ExifInterface.ORIENTATION_FLIP_HORIZONTAL: rotation.postScale(-1,1); break;
                case ExifInterface.ORIENTATION_FLIP_VERTICAL: rotation.postScale(1,-1); break;
                case ExifInterface.ORIENTATION_TRANSPOSE: rotation.postRotate(90); rotation.postScale(-1,1); break;
                case ExifInterface.ORIENTATION_TRANSVERSE: rotation.postRotate(270); rotation.postScale(-1,1); break;
            }
            if (!rotation.isIdentity()) photo = Bitmap.createBitmap(photo,0,0,photo.getWidth(),photo.getHeight(),rotation,true);
        } catch (Exception ignored) { /* Some image formats have no EXIF information. */ }
        return photo;
    }

    private Button button(String text,int bg,int fg) {
        Button button = new Button(this);
        button.setText(text);
        button.setAllCaps(false);
        button.setTextColor(fg);
        button.setTextSize(15);
        button.setBackground(makeBackground(bg));
        return button;
    }
    private GradientDrawable makeBackground(int color) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(dp(18));
        return drawable;
    }
    private int dp(int value) {return (int)(getResources().getDisplayMetrics().density*value+0.5f);}


    @Override protected void onResume() {
        super.onResume();
        if (cropPreview != null) cropPreview.setAspectRatio(getLauncherWidgetAspect());
    }

    /**
     * Prefer the actual installed 1x1 widget proportions reported by the launcher.
     * Before the first widget is added, use the rounded portrait-shaped ratio
     * observed for Samsung 1x1 widgets.
     */
    private float getLauncherWidgetAspect() {
        float ratio = 0.86f;
        try {
            AppWidgetManager manager = AppWidgetManager.getInstance(this);
            int[] ids = manager.getAppWidgetIds(new ComponentName(this, LoveWidgetProvider.class));
            if (ids.length > 0) {
                Bundle options = manager.getAppWidgetOptions(ids[0]);
                int w = options.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH, 0);
                int h = options.getInt(AppWidgetManager.OPTION_APPWIDGET_MAX_HEIGHT, 0);
                if (w > 20 && h > 20) ratio = Math.max(0.65f, Math.min(1.35f, (float) w / h));
            }
        } catch (Exception ignored) { }
        return ratio;
    }

    /**
     * The editor and saved bitmap share one cover-crop algorithm:
     * no letterboxing, no image stretching, no empty margins.
     */
    private static final class CropPreview extends View {
        private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
        private final ScaleGestureDetector scaleDetector;
        private Bitmap bitmap;
        private float zoom = 1f;
        private float panX = 0f, panY = 0f;
        private float aspectRatio = 0.86f;
        private float lastX, lastY;

        CropPreview(Activity context) {
            super(context);
            scaleDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() {
                @Override public boolean onScale(ScaleGestureDetector detector) {
                    zoom = Math.max(1f, Math.min(8f, zoom * detector.getScaleFactor()));
                    invalidate();
                    return true;
                }
            });
        }

        void setAspectRatio(float aspect) {
            float newAspect = Math.max(0.65f, Math.min(1.35f, aspect));
            if (Math.abs(aspectRatio - newAspect) > 0.002f) {
                aspectRatio = newAspect;
                requestLayout();
                invalidate();
            }
        }

        void setPhoto(Bitmap photo) {
            bitmap = photo;
            zoom = 1f;
            panX = panY = 0f;
            invalidate();
        }

        Bitmap getPhoto() { return bitmap; }

        @Override protected void onMeasure(int widthSpec, int heightSpec) {
            int w = MeasureSpec.getSize(widthSpec);
            if (w < 1) w = 1;
            int h = Math.max(1, Math.round(w / aspectRatio));
            setMeasuredDimension(w, h);
        }

        @Override protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int w = getWidth(), h = getHeight();
            if (w <= 0 || h <= 0) return;
            int save = canvas.save();
            Path clipping = new Path();
            float cornerRadius = Math.min(w, h) * 0.24f;
            clipping.addRoundRect(0, 0, w, h, cornerRadius, cornerRadius, Path.Direction.CW);
            canvas.clipPath(clipping);
            drawArt(canvas, w, h);
            canvas.restoreToCount(save);
        }

        private void drawArt(Canvas canvas, int w, int h) {
            canvas.drawColor(0xfff6e5ef);
            if (bitmap == null) return;
            float sourceW = bitmap.getWidth(), sourceH = bitmap.getHeight();
            // COVER rather than FIT: always fill the available widget shape.
            float coverScale = Math.max(w / sourceW, h / sourceH) * zoom;
            float drawnW = sourceW * coverScale, drawnH = sourceH * coverScale;
            float boundX = Math.max(0f, (drawnW - w) * 0.5f);
            float boundY = Math.max(0f, (drawnH - h) * 0.5f);
            float offsetX = Math.max(-boundX, Math.min(boundX, panX * w));
            float offsetY = Math.max(-boundY, Math.min(boundY, panY * h));
            float centerX = w * 0.5f + offsetX, centerY = h * 0.5f + offsetY;
            paint.setAlpha(255);
            canvas.drawBitmap(bitmap, null, new RectF(centerX - drawnW*0.5f,
                centerY - drawnH*0.5f, centerX + drawnW*0.5f,
                centerY + drawnH*0.5f), paint);
        }

        Bitmap renderWidgetBitmap() {
            int outputH = aspectRatio <= 1f ? 640 : Math.round(640f / aspectRatio);
            int outputW = Math.round(outputH * aspectRatio);
            Bitmap result = Bitmap.createBitmap(outputW, outputH, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(result);
            // No transparent padding or baked-in border; widget host handles rounded corners.
            drawArt(canvas, outputW, outputH);
            return result;
        }

        @Override public boolean onTouchEvent(MotionEvent event) {
            if (bitmap == null) return true;
            getParent().requestDisallowInterceptTouchEvent(true);
            scaleDetector.onTouchEvent(event);
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    lastX = event.getX();
                    lastY = event.getY();
                    return true;
                case MotionEvent.ACTION_POINTER_DOWN:
                    lastX = event.getX();
                    lastY = event.getY();
                    return true;
                case MotionEvent.ACTION_MOVE:
                    if (event.getPointerCount() == 1 && !scaleDetector.isInProgress()
                            && getWidth() > 0 && getHeight() > 0) {
                        panX += (event.getX() - lastX) / getWidth();
                        panY += (event.getY() - lastY) / getHeight();
                        panX = Math.max(-8f, Math.min(8f, panX));
                        panY = Math.max(-8f, Math.min(8f, panY));
                        invalidate();
                    }
                    lastX = event.getX();
                    lastY = event.getY();
                    return true;
                case MotionEvent.ACTION_POINTER_UP:
                    if (event.getPointerCount() > 1) {
                        int index = event.getActionIndex() == 0 ? 1 : 0;
                        lastX = event.getX(index);
                        lastY = event.getY(index);
                    }
                    return true;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    performClick();
                    return true;
            }
            return true;
        }

        @Override public boolean performClick() {
            super.performClick();
            return true;
        }
    }
}
