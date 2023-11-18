package com.example.duan1_qt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duan1_qt.database.DBHelper;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class DangKiActivity extends AppCompatActivity {
    DBHelper dbHelper;
    TextInputLayout error_username, error_password, error_sdt;
    TextInputEditText edtUsername, edtPassword, edtSdt;
    Button btnRegister, btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dang_ki);
        error_username = findViewById(R.id.error_username);
        error_password = findViewById(R.id.error_password);
        error_sdt = findViewById(R.id.error_sdt);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        edtSdt = findViewById(R.id.edtSdt);
        btnRegister = findViewById(R.id.btnRegister);
        btnCancel = findViewById(R.id.btnCancel);


        btnRegister.setOnClickListener(new View.OnClickListener() {
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

            if (edtSdt.length() == 0){
                error_sdt.setError("Không để trống ô nhập");
            }else {
                error_sdt.setError("");
            }

            if (edtSdt.length() !=0 && edtPassword.length() != 0 && edtUsername.length() != 0){
                startActivity(new Intent(DangKiActivity.this, DangNhapActivity.class));
            }

            }
        });


    }
}
