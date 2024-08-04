package com.example.bankingapp.directory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bankingapp.R;
import com.example.bankingapp.utils.BaseActivity;

public class LoginActivity extends BaseActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    private String email = "arsinatayuda@example.com";
    private String password = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupViews();
    }

    @Override
    protected void setupViews() {
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example of simple authentication
                if (emailEditText.getText().toString().equals(email) &&
                        passwordEditText.getText().toString().equals(password)) {
                    Intent intent = new Intent(LoginActivity.this,
                            HomeActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "LOGIN BERHASIL!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Username atau Password Yang Anda Masukkan Salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}