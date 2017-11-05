package com.example.emmalady.androidrikkeilesson8applicationa.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.emmalady.androidrikkeilesson8applicationa.activity.MainActivity;

/**
 * Created by Liz Nguyen on 05/11/2017.
 */

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
