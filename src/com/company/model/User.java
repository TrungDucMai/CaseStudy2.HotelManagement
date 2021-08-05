package com.company.model;

import java.io.Serializable;

public class User implements Serializable {
    private String account;
    private String passwords;
    private double phoneNumber;
    private String address;
    private String email;
    private int age;

    public User() {
    }

    public User(String account, String passwords, double phoneNumber, String address, String email, int age) {
        this.account = account;
        this.passwords = passwords;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
