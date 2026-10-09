package com.iloveyounaye.widget;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public final class MainActivity extends Activity {
    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        if (Build.VERSION.SDK_INT >= 33 &&
            checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 10);
        }
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setGravity(Gravity.CENTER);
        panel.setPadding(28, 32, 28, 32);
        panel.setBackgroundColor(Color.rgb(255, 247, 251));

        TextView icon = new TextView(this);
        icon.setText("♥");
        icon.setTextSize(72);
        icon.setTextColor(Color.rgb(235, 73, 135));
        icon.setGravity(Gravity.CENTER);
        panel.addView(icon);

        TextView title = new TextView(this);
        title.setText("음성위젯");
        title.setTextColor(Color.rgb(50, 30, 45));
        title.setTextSize(26);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        panel.addView(title);

        TextView desc = new TextView(this);
        desc.setText("홈 화면의 1×1 사진을 누르면\n다른 앱을 열지 않고 음성이 재생돼요 ♡");
        desc.setTextColor(Color.rgb(110, 80, 100));
        desc.setTextSize(15);
        desc.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams descParams = new LinearLayout.LayoutParams(-1, -2);
        descParams.setMargins(0, 16, 0, 30);
        panel.addView(desc, descParams);

        Button add = new Button(this);
        add.setText("♡ 홈 화면에 위젯 추가");
        add.setAllCaps(false);
        add.setTextColor(Color.WHITE);
        add.setBackground(makeBackground(0xffeb4987));
        panel.addView(add, new LinearLayout.LayoutParams(-1, dp(54)));
        add.setOnClickListener(v -> {
            AppWidgetManager manager = AppWidgetManager.getInstance(this);
            ComponentName provider = new ComponentName(this, LoveWidgetProvider.class);
            if (manager.isRequestPinAppWidgetSupported()) {
                manager.requestPinAppWidget(provider, null, null);
            } else {
                Toast.makeText(this, "홈 화면 빈 곳 길게 누르기 → 위젯 → 음성위젯", Toast.LENGTH_LONG).show();
            }
        });

        Button test = new Button(this);
        test.setText("▶ 음성 미리 듣기");
        test.setAllCaps(false);
        test.setTextColor(0xffeb4987);
        test.setBackground(makeBackground(0xffffe1ed));
        LinearLayout.LayoutParams testParams = new LinearLayout.LayoutParams(-1, dp(54));
        testParams.setMargins(0, 12, 0, 0);
        panel.addView(test, testParams);
        test.setOnClickListener(v -> {
            Intent play = new Intent(this, PlaybackService.class).setAction(PlaybackService.ACTION_PLAY);
            startForegroundService(play);
        });

        setContentView(panel);
    }

    private GradientDrawable makeBackground(int color) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(dp(16));
        return drawable;
    }

    private int dp(int dp) { return Math.round(dp * getResources().getDisplayMetrics().density); }
}
