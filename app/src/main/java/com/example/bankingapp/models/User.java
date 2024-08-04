package com.example.bankingapp.models;

public class User {
    private String name;
    private String phone;
    private String email;
    private String nim;
    private String password;

    // Constructor
    public User(String name, String phone, String email, String nim) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nim = nim;
        this.password = password;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNim() { return nim;}

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
