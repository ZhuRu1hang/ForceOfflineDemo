package com.forceoffline.zhu.forceofflinedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    private Button offlineBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        offlineBt = findViewById(R.id.offline);

        offlineBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent("com.forceofflinedemo.FOCE_OFFLINE");
                sendOrderedBroadcast(intent, null);
            }
        });
    }
}
