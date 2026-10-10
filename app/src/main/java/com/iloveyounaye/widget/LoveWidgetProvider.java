package com.iloveyounaye.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.RemoteViews;
import java.io.File;
import java.io.FileOutputStream;

public final class LoveWidgetProvider extends AppWidgetProvider {
    private static final String PHOTO_FILE = "widget_selected_photo.png";

    @Override public void onUpdate(Context context, AppWidgetManager manager, int[] ids) {
        for (int id : ids) updateWidget(context,manager,id);
    }
    private static void updateWidget(Context context,AppWidgetManager manager,int id) {
        RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.love_widget);
        Bitmap selected=loadSavedPhoto(context);
        if(selected!=null) views.setImageViewBitmap(R.id.widget_photo,selected);
        else views.setImageViewResource(R.id.widget_photo,R.drawable.widget_photo);
        Intent play=new Intent(context,PlaybackService.class).setAction(PlaybackService.ACTION_PLAY);
        PendingIntent pending=PendingIntent.getForegroundService(context,id,play,
            PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        views.setOnClickPendingIntent(R.id.love_widget_root,pending);
        manager.updateAppWidget(id,views);
    }
    private static File photoFile(Context context) {return new File(context.getFilesDir(),PHOTO_FILE);}
    private static Bitmap loadSavedPhoto(Context context) {
        try {
            File file=photoFile(context);
            return file.isFile()?BitmapFactory.decodeFile(file.getAbsolutePath()):null;
        } catch(Exception e) { return null; }
    }
    public static Bitmap getSavedOrDefaultPhoto(Context context) {
        Bitmap photo=loadSavedPhoto(context);
        return photo!=null?photo:BitmapFactory.decodeResource(context.getResources(),R.drawable.widget_photo);
    }
    public static void saveAndUpdate(Context context,Bitmap photo) throws Exception {
        File file=photoFile(context);
        try(FileOutputStream out=new FileOutputStream(file)) {
            if(!photo.compress(Bitmap.CompressFormat.PNG,100,out)) throw new Exception("photo write failed");
        }
        refreshWidgets(context);
    }
    public static void clearPhotoAndUpdate(Context context) {
        File file=photoFile(context);
        if(file.exists()) file.delete();
        refreshWidgets(context);
    }
    private static void refreshWidgets(Context context) {
        AppWidgetManager manager=AppWidgetManager.getInstance(context);
        int[] ids=manager.getAppWidgetIds(new ComponentName(context,LoveWidgetProvider.class));
        for(int id:ids) updateWidget(context,manager,id);
    }
}
