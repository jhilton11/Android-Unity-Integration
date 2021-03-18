package com.appify.test;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.unity3d.player.UnityPlayerActivity;

import java.util.UUID;

public class MiddleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);

        String id = UUID.randomUUID().toString();
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }

}