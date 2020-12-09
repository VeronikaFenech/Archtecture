package com.example.architecture;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActiviti extends AppCompatActivity {
    public static final int DELAY_IN_MILLIS=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> startActivity(new Intent(SplashActiviti.this, MainActivity.class)),
        DELAY_IN_MILLIS);
        finish();
    }
}