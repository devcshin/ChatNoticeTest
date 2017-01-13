package com.icyfruits.devc.chatnoticetest;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by DEV.C on 2017-01-13.
 */

public class MessageService extends FirebaseMessagingService {

    private static final String TAG = "MsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        sendNotification(remoteMessage.getData().get("Message"));
    }

    private void sendNotification(String messageBody){

        NotificationCompat.Builder nb = new NotificationCompat.Builder(this)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_menu_send)
                .setContentTitle("Message")
                .setContentText(messageBody);

        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        nm.notify(0, nb.build());

    }
}
