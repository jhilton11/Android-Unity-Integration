package com.appify.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.unity3d.player.ResultReceiverClass;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity implements ResultReceiverClass.ResultTransferListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.launch_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MiddleActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void OnResultTransfer(String text) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("id", text);
        startActivity(intent);
    }
}