package com.example.baitap;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Date;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Thực hiện các hành động khi thông báo được kích hoạt
        NotificationHelper.showNotification(context, "Nhắc nhở", "Đã đến lúc làm điều gì đó!");
    }
}