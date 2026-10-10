package com.iloveyounaye.widget;

import android.Manifest;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;

public final class MainActivity extends Activity {
    private static final int PHOTO_PICK = 410;
    private static final String SOURCE_FILE = "selected_photo_source.jpg";
    private static final String SETTINGS = "crop_settings_v7";
    private final Handler handler = new Handler(Looper.getMainLooper());
    private PhotoCropView editor;
    private boolean previewPending;
    private boolean ready;
    private SeekBar aspectSlider;
    private TextView aspectLabel;
    private final Runnable previewTask = () -> {
        previewPending=false;
        if (editor==null || editor.getPhoto()==null) return;
        Bitmap preview=editor.exportWidgetBitmap();
        try { LoveWidgetProvider.previewAndUpdate(this,preview); }
        finally { preview.recycle(); }
    };

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        if(Build.VERSION.SDK_INT>=33 && checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS)!=PackageManager.PERMISSION_GRANTED)
            requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS},12);

        ScrollView scroll=new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setBackgroundColor(0xfffbf8fa);
        LinearLayout root=new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(18),dp(22),dp(18),dp(30));
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        scroll.addView(root);

        TextView title=new TextView(this);
        title.setText("음성위젯");
        title.setTextSize(25);title.setTypeface(Typeface.DEFAULT,Typeface.BOLD);
        title.setTextColor(0xff332631);title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(-1,-2));

        TextView info=new TextView(this);
        info.setText("사진 위의 둥근 틀이 실제 위젯에 들어갈 영역이에요.\n드래그해서 위치 이동 · 두 손가락으로 확대/축소");
        info.setTextColor(0xff856a7a);info.setGravity(Gravity.CENTER);
        info.setTextSize(13);
        LinearLayout.LayoutParams ilp=new LinearLayout.LayoutParams(-1,-2);
        ilp.setMargins(0,dp(10),0,dp(12));
        root.addView(info,ilp);

        editor=new PhotoCropView(this);
        editor.setCropRatio(getWidgetRatio());
        Bitmap source=loadSource();
        editor.setPhoto(source!=null?source:BitmapFactory.decodeResource(getResources(),R.drawable.widget_photo));
        editor.setTransform(getPreferences(MODE_PRIVATE).getFloat("zoom",1f),
            getPreferences(MODE_PRIVATE).getFloat("pan_x",0f),
            getPreferences(MODE_PRIVATE).getFloat("pan_y",0f));
        root.addView(editor,new LinearLayout.LayoutParams(-1,dp(410)));
        editor.setChangeListener(new PhotoCropView.ChangeListener() {
            @Override public void onChanged() { schedulePreview(); }
            @Override public void onFinished() { saveAndApply(false); }
        });

        TextView hint=new TextView(this);
        hint.setText("틀 안에 보이는 사진만 저장돼요 · 분홍색 여백 없음");
        hint.setTextColor(0xff856a7a);hint.setTextSize(12);hint.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams hlp=new LinearLayout.LayoutParams(-1,-2);
        hlp.setMargins(0,dp(10),0,dp(8));
        root.addView(hint,hlp);

        aspectLabel=new TextView(this);
        aspectLabel.setTextSize(12);aspectLabel.setTextColor(0xff72586c);
        aspectLabel.setGravity(Gravity.CENTER);
        root.addView(aspectLabel,new LinearLayout.LayoutParams(-1,-2));

        aspectSlider=new SeekBar(this);
        aspectSlider.setMax(70);
        aspectSlider.setProgress(Math.round((editor.getCropRatio()-.65f)*100));
        root.addView(aspectSlider,new LinearLayout.LayoutParams(-1,dp(34)));
        refreshAspectLabel();
        aspectSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar bar) { }
            public void onProgressChanged(SeekBar bar,int progress,boolean user) {
                if (!ready || !user) return;
                editor.setCropRatio(.65f+progress/100f);
                refreshAspectLabel();
            }
            public void onStopTrackingTouch(SeekBar bar) { saveAndApply(false); }
        });

        Button pick=makeButton("사진 선택하기",0xffe94d8c,Color.WHITE);
        root.addView(pick,new LinearLayout.LayoutParams(-1,dp(52)));
        pick.setOnClickListener(v-> {
            Intent intent=new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivityForResult(intent,PHOTO_PICK);
        });

        Button save=makeButton("✓ 지금 보이는 영역 위젯에 저장",0xffe4d0df,0xff4e3142);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,dp(50));lp.setMargins(0,dp(9),0,0);
        root.addView(save,lp);
        save.setOnClickListener(v->saveAndApply(true));

        Button reset=makeButton("기본 사진으로 초기화",0xfff1eaf0,0xff705568);
        LinearLayout.LayoutParams rp=new LinearLayout.LayoutParams(-1,dp(46));rp.setMargins(0,dp(9),0,0);
        root.addView(reset,rp);
        reset.setOnClickListener(v-> {
            File file=getSourceFile();
            if(file.isFile())file.delete();
            editor.setPhoto(BitmapFactory.decodeResource(getResources(),R.drawable.widget_photo));
            saveAndApply(true);
        });

        Button add=makeButton("홈 화면에 1×1 위젯 추가",0xffe94d8c,Color.WHITE);
        LinearLayout.LayoutParams ap=new LinearLayout.LayoutParams(-1,dp(52));ap.setMargins(0,dp(18),0,0);
        root.addView(add,ap);
        add.setOnClickListener(v-> {
            AppWidgetManager manager=AppWidgetManager.getInstance(this);
            ComponentName component=new ComponentName(this,LoveWidgetProvider.class);
            if(manager.isRequestPinAppWidgetSupported())
                manager.requestPinAppWidget(component,null,null);
            else Toast.makeText(this,"홈 화면을 길게 누른 후 음성위젯을 추가해 주세요",Toast.LENGTH_LONG).show();
        });

        Button play=makeButton("▶ 음성 미리 듣기",0xfff7e5ee,0xffbd3571);
        LinearLayout.LayoutParams pp=new LinearLayout.LayoutParams(-1,dp(50));pp.setMargins(0,dp(9),0,0);
        root.addView(play,pp);
        play.setOnClickListener(v-> {
            Intent intent=new Intent(this,PlaybackService.class).setAction(PlaybackService.ACTION_PLAY);
            startForegroundService(intent);
        });

        setContentView(scroll);
        ready=true;
    }

    private void refreshAspectLabel() {
        aspectLabel.setText(String.format(Locale.KOREA,"위젯 틀 비율 조절  ·  가로/세로 %.2f",editor.getCropRatio()));
    }
    private int dp(float d){return Math.round(d*getResources().getDisplayMetrics().density);}
    private Button makeButton(String title,int background,int foreground) {
        Button result=new Button(this);
        result.setText(title);result.setAllCaps(false);
        result.setTextColor(foreground);result.setTextSize(14);
        GradientDrawable shape=new GradientDrawable();shape.setColor(background);shape.setCornerRadius(dp(15));
        result.setBackground(shape);
        return result;
    }
    private File getSourceFile(){return new File(getFilesDir(),SOURCE_FILE);}
    private Bitmap loadSource(){
        try {
            File file=getSourceFile();
            if(file.isFile())return BitmapFactory.decodeFile(file.getAbsolutePath());
        }catch(Exception ignored){ }
        return null;
    }
    private void saveSource(Bitmap src) throws Exception {
        try(FileOutputStream out=new FileOutputStream(getSourceFile())) {
            if(!src.compress(Bitmap.CompressFormat.JPEG,93,out))throw new Exception("source encoding failed");
        }
    }
    private float getWidgetRatio() {
        float fallback=getPreferences(MODE_PRIVATE).getFloat("ratio",.84f);
        try {
            AppWidgetManager manager=AppWidgetManager.getInstance(this);
            int[] ids=manager.getAppWidgetIds(new ComponentName(this,LoveWidgetProvider.class));
            if(ids.length>0 && !getPreferences(MODE_PRIVATE).getBoolean("ratio_manual",false)) {
                Bundle opts=manager.getAppWidgetOptions(ids[0]);
                int w=opts.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH,0);
                int h=opts.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_HEIGHT,0);
                if(w>20 && h>20) return Math.max(.65f,Math.min(1.35f,(float)w/h));
            }
        }catch(Exception ignored) { }
        return fallback;
    }

    private void schedulePreview(){
        if(!ready||editor==null||editor.getPhoto()==null)return;
        if(previewPending)return;
        previewPending=true;
        handler.postDelayed(previewTask,160);
    }

    /** Save crop and transform at release; remote widget also updates during gestures. */
    private void saveAndApply(boolean toast){
        if(editor==null||editor.getPhoto()==null)return;
        handler.removeCallbacks(previewTask);previewPending=false;
        try {
            Bitmap result=editor.exportWidgetBitmap();
            try { LoveWidgetProvider.saveAndUpdate(this,result); }
            finally { result.recycle(); }
            getPreferences(MODE_PRIVATE).edit()
                .putFloat("zoom",editor.getZoom())
                .putFloat("pan_x",editor.getPanX())
                .putFloat("pan_y",editor.getPanY())
                .putFloat("ratio",editor.getCropRatio())
                .putBoolean("ratio_manual",true).apply();
            if(toast)Toast.makeText(this,"선택한 틀 그대로 위젯 적용 완료",Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            Toast.makeText(this,"사진 적용 실패: 다시 시도해 주세요",Toast.LENGTH_SHORT).show();
        }
    }

    @Override protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode!=PHOTO_PICK||resultCode!=RESULT_OK||data==null||data.getData()==null)return;
        try {
            Bitmap image=decodePhoto(data.getData());
            if(image==null)throw new Exception("empty image");
            saveSource(image);
            editor.setPhoto(image);
            saveAndApply(false);
            Toast.makeText(this,"사진을 선택했어요. 틀을 움직이면 위젯도 바뀌어요",Toast.LENGTH_LONG).show();
        }catch(Exception e){Toast.makeText(this,"사진을 열 수 없어요",Toast.LENGTH_LONG).show();}
    }

    private Bitmap decodePhoto(Uri uri) throws Exception {
        BitmapFactory.Options op=new BitmapFactory.Options();
        op.inJustDecodeBounds=true;
        try(InputStream in=getContentResolver().openInputStream(uri)) { BitmapFactory.decodeStream(in,null,op); }
        if(op.outWidth<=0||op.outHeight<=0)throw new Exception("bad photo");
        int sample=1;
        while(Math.max(op.outWidth,op.outHeight)/sample>1800)sample*=2;
        op.inJustDecodeBounds=false;op.inSampleSize=sample;
        Bitmap bmp;
        try(InputStream in=getContentResolver().openInputStream(uri)){bmp=BitmapFactory.decodeStream(in,null,op);}
        if(bmp==null)throw new Exception("decode failed");
        try(InputStream in=getContentResolver().openInputStream(uri)){
            ExifInterface exif=new ExifInterface(in);
            int o=exif.getAttributeInt(ExifInterface.TAG_ORIENTATION,ExifInterface.ORIENTATION_NORMAL);
            Matrix m=new Matrix();
            switch(o){
                case ExifInterface.ORIENTATION_ROTATE_90:m.postRotate(90);break;
                case ExifInterface.ORIENTATION_ROTATE_180:m.postRotate(180);break;
                case ExifInterface.ORIENTATION_ROTATE_270:m.postRotate(270);break;
                case ExifInterface.ORIENTATION_FLIP_HORIZONTAL:m.postScale(-1,1);break;
                case ExifInterface.ORIENTATION_FLIP_VERTICAL:m.postScale(1,-1);break;
                case ExifInterface.ORIENTATION_TRANSPOSE:m.postRotate(90);m.postScale(-1,1);break;
                case ExifInterface.ORIENTATION_TRANSVERSE:m.postRotate(270);m.postScale(-1,1);break;
            }
            if(!m.isIdentity())bmp=Bitmap.createBitmap(bmp,0,0,bmp.getWidth(),bmp.getHeight(),m,true);
        }catch(Exception ignored){ }
        return bmp;
    }
    @Override protected void onPause(){
        if(previewPending){handler.removeCallbacks(previewTask);previewPending=false;saveAndApply(false);}
        super.onPause();
    }
    @Override protected void onDestroy(){handler.removeCallbacks(previewTask);super.onDestroy();}
}
