package com.example.duan1_qt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhapActivity extends AppCompatActivity {

    private TextView dangki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dang_nhap);
        dangki = findViewById(R.id.tvDangKi);

        dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(DangNhapActivity.this, DangKiActivity.class));
            finish();
            }
        });

    }
}
