package com.example.app2;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompat.MessagingStyle;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class MockDatabase {
    public static MessagingStyleCommsAppData getMessagingStyleData(Context context){
        return MessagingStyleCommsAppData.getInstance(context);
    }
    public static class MessagingStyleCommsAppData extends MockNotificationData {
        private static MessagingStyleCommsAppData sInstance = null;
        private ArrayList<MessagingStyle.Message> mMessages;
        private String mFullConversation;
        private Person Nessi;
        //private CharSequence[] mReply;
        public static MessagingStyleCommsAppData getInstance(Context context){
            if(sInstance==null){
                sInstance = getSync(context);
            }
            return sInstance;
        }
        private static synchronized MessagingStyleCommsAppData getSync(Context context){
            if(sInstance==null){
                sInstance = new MessagingStyleCommsAppData(context);
            }
            return sInstance;
        }
        public MessagingStyleCommsAppData(Context context){
            String mContentTitle = "WellNessi Whale Notification";
            int mPriority = NotificationCompat.PRIORITY_HIGH;
            Nessi =
                    new Person.Builder()
                        .setName("Nessi Whale")
                        .setKey("1234567890")
                        .setUri("tel:1234567890")
                        /*.setIcon(

                        )*/
                        .build();

            mMessages = new ArrayList<>();
            mMessages.add(
                    new MessagingStyle.Message("You're doing great! Don't forget to take a break!", 1528490641998L, Nessi)
            );
            //mReply = new CharSequence[] {"OK!","Already done!","No thanks!"};
        }
        public ArrayList<MessagingStyle.Message> getMessage() {return mMessages;}
        public Person getMe() {return Nessi;}
    }
    public abstract static class MockNotificationData{
        protected static String mContentTitle;
        protected static String mContentText;
        protected static int mPriority;
        protected String mChannelId;
        protected CharSequence mChannelName;
        protected String mChannelDescription;
        protected int mChannelImportance;
        protected boolean mChannelEnableVibrate;
        protected static int mChannelLockscreenVisibility;

        public static String getContentTitle(){ return mContentTitle; }
        public static String getContentText() {
            return mContentText;
        }
        public static int getPriority(){return mPriority;}

        public String getChannelId() {
            return mChannelId;
        }
        public CharSequence getChannelName() {
            return mChannelName;
        }
        public String getChannelDescription() {
            return mChannelDescription;
        }
        public int getChannelImportance() {
            return mChannelImportance;
        }
        public boolean isChannelEnableVibrate() {
            return mChannelEnableVibrate;
        }
        public static int getChannelLockscreenVisibility() {
            return mChannelLockscreenVisibility;
        }
    }
    public static Uri resourceToUri(Context context, int resId) {
        return Uri.parse(
                ContentResolver.SCHEME_ANDROID_RESOURCE
                        + "://"
                        + context.getResources().getResourcePackageName(resId)
                        + "/"
                        + context.getResources().getResourceTypeName(resId)
                        + "/"
                        + context.getResources().getResourceEntryName(resId));
    }
}
