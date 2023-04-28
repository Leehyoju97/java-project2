package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1122 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();
        int min = sec / 60;
        sec = sec % 60;

        System.out.printf("%d %d", min, sec);
    }
}
