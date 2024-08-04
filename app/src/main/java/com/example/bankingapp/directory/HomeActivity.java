package com.example.bankingapp.directory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bankingapp.R;
import com.example.bankingapp.utils.BaseActivity;

public class HomeActivity extends BaseActivity {
    private Button profileButton;
    private Button masterDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupViews();
    }

    @Override
    protected void setupViews() {
        profileButton = findViewById(R.id.profileButton);
        masterDataButton = findViewById(R.id.masterDataButton);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        masterDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, MasterActivity.class);
                startActivity(intent);
            }
        });
    }
}