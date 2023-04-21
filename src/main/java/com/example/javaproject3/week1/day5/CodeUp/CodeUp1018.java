package com.example.javaproject3.week1.day5.CodeUp;

import java.util.Scanner;

public class CodeUp1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split(":");

        int hour = Integer.parseInt(str[0]);
        String middle = ":";
        int minute = Integer.parseInt(str[1]);

        System.out.printf("%d%s%d", hour, middle, minute);
    }
}
