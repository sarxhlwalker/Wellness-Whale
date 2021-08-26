package com.example.app2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class NotificationUtil {
    /*public static String createNotificationChannel(
            Context context){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            String channelID = mockNotificationData.getChannelId();
            CharSequence channelName = mockNotificationData.getChannelName();
            String channelDescription = mockNotificationData.getChannelDescription();
            int channelImportance = mockNotificationData.getChannelImportance();
            boolean channelEnableVibrate = mockNotificationData.isChannelEnableVibrate();
            int channelLockscreenVisibility = mockNotificationData.getChannelLockscreenVisibility();
            NotificationChannel notificationChannel = new NotificationChannel(channelID,channelName,channelImportance);
            notificationChannel.setDescription(channelDescription);
            notificationChannel.enableVibration(channelEnableVibrate);
            notificationChannel.setLockscreenVisibility(channelLockscreenVisibility);
            NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
            return channelID;
        }
        else{
            return null;
        }
    }*/
}
