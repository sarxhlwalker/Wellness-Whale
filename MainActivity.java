package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.DialogInterface;
import android.content.Intent;
import com.example.app2.MockDatabase;
import com.example.app2.NotificationUtil;
import com.google.android.material.snackbar.Snackbar;

import android.os.Build;
import android.os.CountDownTimer;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Spinner;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.content.ContextCompat;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private static final String CHANNEL_ID = "Whale Break";
    private NotificationManagerCompat mNotificationManagerCompat;
    public boolean takeBreak = false;
    public boolean takeExercise = false;
    public boolean takePositivity = false;
    public boolean takeHydration = false;
    public boolean takeFood = false;
    public boolean stopBreak = false;
    public boolean stopExercise = false;
    public boolean stopPositivity = false;
    public boolean stopHydration = false;
    public boolean stopFood = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "BOB";
            String description = "Joe";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
    public void showNotif(boolean takeBreak){
        if (takeBreak){
            NotificationCompat.Builder notificationCompatBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
            notificationCompatBuilder
                    .setSmallIcon(R.mipmap.ic_whale_foreground)
                    .setContentTitle("Nessi the Whale")
                    .setContentText("You're doing great; don't forget to take a break!")
                    .setPriority(NotificationCompat.PRIORITY_MAX);
            Notification notification = notificationCompatBuilder.build();
            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(1234, notification);
            timeBreak(takeBreak);
        }
    }
    public void timeBreak(boolean takeBreak){
        if(!stopBreak){
            new CountDownTimer(10000, 1000) {
                public void onTick(long millisUntilFinished) {
                    System.out.println(millisUntilFinished);
                }
                public void onFinish() {
                    showNotif(takeBreak);
                }
            }.start();
        }
    }
    public void showNotif2(boolean takeExercise){
        if (takeExercise) {
            NotificationCompat.Builder notificationCompatBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
            notificationCompatBuilder
                    .setSmallIcon(R.mipmap.ic_whale_foreground)
                    .setContentTitle("Nessi the Whale")
                    .setContentText("Remember go for a walk every now and then!")
                    .setPriority(NotificationCompat.PRIORITY_MAX);
            Notification notification = notificationCompatBuilder.build();
            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(1234, notification);
            timeExercise(takeExercise);
        }
    }
    public void timeExercise(boolean takeExercise){
        if(!stopExercise){
            new CountDownTimer(15000, 1000) {
                public void onTick(long millisUntilFinished) {
                    System.out.println(millisUntilFinished);
                }
                public void onFinish() {
                    showNotif2(takeExercise);
                }
            }.start();
        }
    }
    public void showNotif3(boolean takePositivity){
        if (takePositivity) {
            NotificationCompat.Builder notificationCompatBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
            notificationCompatBuilder
                    .setSmallIcon(R.mipmap.ic_whale_foreground)
                    .setContentTitle("Nessi the Whale")
                    .setContentText("You're doing great! I believe in you! <3")
                    .setPriority(NotificationCompat.PRIORITY_MAX);
            Notification notification = notificationCompatBuilder.build();
            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(1234, notification);
            timePositivity(takePositivity);
        }
    }
    public void timePositivity(boolean takePositivity){
        if(!stopPositivity){
            new CountDownTimer(20000, 1000) {
                public void onTick(long millisUntilFinished) {
                    System.out.println(millisUntilFinished);
                }
                public void onFinish() {
                    showNotif3(takePositivity);
                }
            }.start();
        }
    }
    public void showNotif4(boolean takeHydration){
        if (takeHydration) {
            NotificationCompat.Builder notificationCompatBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
            notificationCompatBuilder
                    .setSmallIcon(R.mipmap.ic_whale_foreground)
                    .setContentTitle("Nessi the Whale")
                    .setContentText("Don't forget to drink water!")
                    .setPriority(NotificationCompat.PRIORITY_MAX);
            Notification notification = notificationCompatBuilder.build();
            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(1234, notification);
            timeHydration(takeHydration);
        }
    }
    public void timeHydration(boolean takeHydration){
        if(!stopHydration){
            new CountDownTimer(25000, 1000) {
                public void onTick(long millisUntilFinished) {
                    System.out.println(millisUntilFinished);
                }
                public void onFinish() {
                    showNotif4(takeHydration);
                }
            }.start();
        }
    }
    public void showNotif5(boolean takeFood){
        if (takeFood){
            NotificationCompat.Builder notificationCompatBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
            notificationCompatBuilder
                    .setSmallIcon(R.mipmap.ic_whale_foreground)
                    .setContentTitle("Nessi the Whale")
                    .setContentText("Keep your energy up and have a snack!")
                    .setPriority(NotificationCompat.PRIORITY_MAX);
            Notification notification = notificationCompatBuilder.build();
            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(1234, notification);
            timeFood(takeFood);
        }
    }
    public void timeFood(boolean takeFood){
        if(!stopFood){
            new CountDownTimer(30000, 1000) {
                public void onTick(long millisUntilFinished) {
                    System.out.println(millisUntilFinished);
                }
                public void onFinish() {
                    showNotif5(takeFood);
                }
            }.start();
        }
    }
    public void clickBreak(View view) {
        createNotificationChannel();
        takeBreak = !takeBreak;
        System.out.println(takeBreak);
        if(takeBreak){
            stopBreak = false;
            timeBreak(takeBreak);
        }
        else{
            stopBreak = true;
        }
    }
    public void clickExercise(View view){
        createNotificationChannel();
        takeExercise = !takeExercise;
        System.out.println(takeExercise);
        if(takeExercise){
            stopExercise = false;
            timeExercise(takeExercise);
        }
        else{
            stopExercise = true;
        }
    }
    public void clickPositivity(View view){
        createNotificationChannel();
        takePositivity = !takePositivity;
        System.out.println(takePositivity);
        if(takePositivity){
            stopPositivity = false;
            timePositivity(takePositivity);
        }
        else{
            stopPositivity = true;
        }
    }
    public void clickHydration(View view){
        createNotificationChannel();
        takeHydration = !takeHydration;
        System.out.println(takeHydration);
        if(takeHydration){
            stopHydration = false;
            timeHydration(takeHydration);
        }
        else{
            stopHydration = true;
        }
    }
    public void clickFood(View view){
        createNotificationChannel();
        takeFood = !takeFood;
        System.out.println(takeFood);
        if(takeFood){
            stopFood = false;
            timeFood(takeFood);
        }
        else{
            stopFood = true;
        }
    }
}