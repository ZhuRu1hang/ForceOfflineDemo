package com.forceoffline.zhu.forceofflinedemo;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*
 *   所有Aciivity的基类, 创建时添加到ActivityController, 销毁时清除,
 *   onResume时负责注册BroadcastReceiver     onPause时负责解注册   因为只需要强制下线活跃状态下的Activity
 * */

public class BaseActivity extends AppCompatActivity {

    private ForceOfflineRecevier recevier;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityController.addActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter("com.forceofflinedemo.FOCE_OFFLINE");
        recevier = new ForceOfflineRecevier();
        registerReceiver(recevier, filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (recevier != null) {
            unregisterReceiver(recevier);
            recevier = null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.delActivity(this);
    }
}
