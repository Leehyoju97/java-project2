package com.example.javaproject3.week4.day1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.setAge(34);
        return user;
    }
}

