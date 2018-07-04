package com.forceoffline.zhu.forceofflinedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private EditText usernName;
    private EditText passWorld;
    SharedPreferences accountPerf;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usernName = findViewById(R.id.username);
        passWorld = findViewById(R.id.passworld);

    }

    public void login(View v) {

        String name = usernName.getText().toString();
        String pass = passWorld.getText().toString();
        if (!name.isEmpty() && !pass.isEmpty()) {
            accountPerf = getSharedPreferences("account", MODE_PRIVATE);
            SharedPreferences.Editor accountEd = accountPerf.edit();
            accountEd.putString("name", name);
            accountEd.putString("passworld", pass);
            accountEd.commit();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "用户名或者密码不能为空", Toast.LENGTH_SHORT).show();
        }

    }
}
