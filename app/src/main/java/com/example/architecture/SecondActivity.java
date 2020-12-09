package com.example.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond =findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(view->{
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
            finish();
        });
    }
}