package com.icyfruits.devc.chatnoticetest;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by DEV.C on 2017-01-13.
 */

public class IDService extends FirebaseInstanceIdService {

    private static final String TAG = "Service";

    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        sendToServer(refreshedToken);

    }

    private void sendToServer(String token){

    }
}
