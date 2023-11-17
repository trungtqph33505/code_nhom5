package com.example.duan1_qt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelComeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_come);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(new Intent(WelComeActivity.this, DangNhapActivity.class));
            finish();
            }
        },1500);
    }
}