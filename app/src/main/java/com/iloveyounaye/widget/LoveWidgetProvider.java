package com.iloveyounaye.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public final class LoveWidgetProvider extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        for (int id : appWidgetIds) {
            RemoteViews widget = new RemoteViews(context.getPackageName(), R.layout.love_widget);
            Intent intent = new Intent(context, PlaybackService.class);
            intent.setAction(PlaybackService.ACTION_PLAY);
            PendingIntent play = PendingIntent.getForegroundService(
                context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
            widget.setOnClickPendingIntent(R.id.love_widget_root, play);
            manager.updateAppWidget(id, widget);
        }
    }
}
