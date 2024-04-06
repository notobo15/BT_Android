package com.example.baitap;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

public class AlarmScheduler {

    public static void scheduleNotification(Context context, long delayInMillis) {
        // Tạo một lịch thông báo
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        // Thiết lập thời gian bắt đầu thông báo (ví dụ: sau 10 giây)
        long triggerAtMillis = System.currentTimeMillis() + delayInMillis;

        // Đặt lịch thông báo
        alarmManager.set(AlarmManager.RTC_WAKEUP, triggerAtMillis, pendingIntent);
    }
}