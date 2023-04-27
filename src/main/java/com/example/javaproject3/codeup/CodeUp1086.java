package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();

        System.out.printf("%.2f MB", w * h * b / (1024 * 1024 * 8.0));
    }
}
