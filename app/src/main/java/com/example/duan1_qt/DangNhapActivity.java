package com.example.duan1_qt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duan1_qt.database.DBHelper;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class DangNhapActivity extends AppCompatActivity {

    TextView tvDangki;
    DBHelper dbHelper;
    TextInputLayout error_username, error_password;
    TextInputEditText edtUsername, edtPassword;
    Button btnLogin, btnCancel;
    CheckBox cboxRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dang_nhap);
        tvDangki = findViewById(R.id.tvDangKi);
        error_username = findViewById(R.id.error_username);
        error_password = findViewById(R.id.error_password);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        cboxRemember = findViewById(R.id.cboxRemember);
        btnLogin = findViewById(R.id.btnLogin);
        btnCancel = findViewById(R.id.btnCancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUsername.length() == 0){
                    error_username.setError("Không để trống ô nhập");
                }else {
                    error_username.setError("");
                }

                if (edtPassword.length() == 0){
                    error_password.setError("Không để trống ô nhập");
                }else {
                    error_password.setError("");
                }

                if (cboxRemember.isChecked()){
                    Toast.makeText(DangNhapActivity.this, "Đã lưu đăng nhập", Toast.LENGTH_SHORT).show();
                }

                if (edtUsername.length() != 0 && edtPassword.length() != 0){
                    startActivity(new Intent(DangNhapActivity.this, MainActivity.class));
                }

            }

        });

        tvDangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(DangNhapActivity.this, DangKiActivity.class));
            finish();
            }
        });

    }
}
