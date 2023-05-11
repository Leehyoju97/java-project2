package com.example.javaproject3.week4.day4;

import com.example.javaproject3.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미미", "010-1234-5678", 37);
        users.add(user1);

        User user2 = new User("김나나", "010-1234-5679", 30);
        users.add(user2);

        for (User u : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", u.getName(), u.getPhoneNumber());
        }

    }
}
