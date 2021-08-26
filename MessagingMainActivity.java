package com.example.app2;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
public class MessagingMainActivity extends Activity {
    private static final String TAG = "MessagingMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_messaging_main);
        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        //notificationManager.cancel(MainActivity.NOTIFICATION_ID);
    }
}
