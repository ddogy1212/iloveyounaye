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
    private static final String PHOTO_FILE="widget_selected_photo.jpg";

    @Override public void onUpdate(Context context,AppWidgetManager manager,int[] ids){
        Bitmap bmp=loadPhoto(context);
        for(int id:ids)updateOne(context,manager,id,bmp);
    }
    @Override public void onAppWidgetOptionsChanged(Context context,AppWidgetManager manager,int id,android.os.Bundle options){
        super.onAppWidgetOptionsChanged(context,manager,id,options);
        updateOne(context,manager,id,loadPhoto(context));
    }

    private static void updateOne(Context context,AppWidgetManager manager,int id,Bitmap bitmap){
        RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.love_widget);
        if(bitmap!=null)views.setImageViewBitmap(R.id.widget_photo,bitmap);
        else views.setImageViewResource(R.id.widget_photo,R.drawable.widget_photo);
        Intent play=new Intent(context,PlaybackService.class).setAction(PlaybackService.ACTION_PLAY);
        PendingIntent intent=PendingIntent.getForegroundService(context,id,play,
                PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        views.setOnClickPendingIntent(R.id.love_widget_root,intent);
        manager.updateAppWidget(id,views);
    }
    private static Bitmap loadPhoto(Context context){
        try{
            File file=new File(context.getFilesDir(),PHOTO_FILE);
            if(file.isFile())return BitmapFactory.decodeFile(file.getAbsolutePath());
        }catch(Exception ignored) { }
        return null;
    }
    private static void updateAll(Context context,Bitmap bitmap){
        AppWidgetManager manager=AppWidgetManager.getInstance(context);
        int[] ids=manager.getAppWidgetIds(new ComponentName(context,LoveWidgetProvider.class));
        for(int id:ids)updateOne(context,manager,id,bitmap);
    }
    /** Live changes are sent to the widgets without waiting for the save button. */
    public static void previewAndUpdate(Context context,Bitmap bitmap){
        updateAll(context,bitmap);
    }
    public static void saveAndUpdate(Context context,Bitmap bitmap)throws Exception{
        File file=new File(context.getFilesDir(),PHOTO_FILE);
        File temp=new File(context.getFilesDir(),PHOTO_FILE+".tmp");
        try(FileOutputStream stream=new FileOutputStream(temp)){
            if(!bitmap.compress(Bitmap.CompressFormat.JPEG,93,stream))throw new Exception("bitmap encoding failed");
        }
        if(!temp.renameTo(file)){
            if(file.exists()&&!file.delete())throw new Exception("old image locked");
            if(!temp.renameTo(file))throw new Exception("image replacement failed");
        }
        updateAll(context,bitmap);
    }
}
