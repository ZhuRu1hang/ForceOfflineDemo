package com.forceoffline.zhu.forceofflinedemo;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class ForceOfflineRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Waring");
        builder.setMessage("You are force to be offline. Please try to login again.");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityController.finishAll();
                Intent intent = new Intent(context, LoginActivity.class);
                context.startActivity(intent);
            }
        });
        builder.show();
    }
}
