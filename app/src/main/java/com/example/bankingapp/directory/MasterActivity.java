package com.example.bankingapp.directory;

import android.os.Bundle;
import android.widget.TextView;

import com.example.bankingapp.R;
import com.example.bankingapp.utils.BaseActivity;
import com.example.bankingapp.models.User;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends BaseActivity {

    private TextView masterDataInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    @Override
    protected void setupViews() {
        masterDataInfo = findViewById(R.id.masterDataInfo);

        List<User> userList = getUsers();
        StringBuilder info = new StringBuilder();

        for (User user : userList) {
            info.append("Name: ").append(user.getName()).append("\n")
                    .append("Email: ").append(user.getEmail()).append("\n")
                    .append("Phone: ").append(user.getPhone()).append("\n")
                    .append("Nim: ").append(user.getNim()).append("\n\n");
        }

        masterDataInfo.setText(info.toString());
    }

    private List<User> getUsers() {
        // Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("Muhammad Arsi Nata Yuda", "081211111111", "arsinatayuda@example.com", "220101020018"));
        users.add(new User("Mahasiswa1", "0812762872826", "mahasiswa1@example.com", "220101020019"));
        users.add(new User("Mahasiswa2", "0877289283674", "mahasiswa2@example.com","220101020020"));
        return users;
    }
}