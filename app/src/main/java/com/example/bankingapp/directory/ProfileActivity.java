package com.example.bankingapp.directory;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bankingapp.R;
import com.example.bankingapp.utils.BaseActivity;
import com.example.bankingapp.models.User;

public class ProfileActivity extends BaseActivity {
    private TextView nameTextView;
    private TextView phoneTextView;
    private TextView emailTextView;
    private TextView nimTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
    }

    @Override
    protected void setupViews() {
        nameTextView = findViewById(R.id.nameTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);
        nimTextView = findViewById(R.id.nimTextView);

        // Example user
        User user = new User("Muhammad Arsi Nata Yuda", "0812-8312-9444", "arsinatayuda@example.com", "220101020018");

        nameTextView.setText(user.getName());
        phoneTextView.setText(user.getPhone());
        emailTextView.setText(user.getEmail());
        nimTextView.setText(user.getNim());
    }
}