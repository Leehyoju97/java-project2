package com.example.javaproject3.week1.day5.practice;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "이효주";
        user.phoneNumber = "010-1111-1212";
        user.age = 27;

        System.out.printf("이름 : %s 폰번호 : %s, 나이 : %d\n", user.name, user.phoneNumber, user.age);
        System.out.printf("%s님은 성인인가요? : %s", user.name, user.isAdult());
    }
}
