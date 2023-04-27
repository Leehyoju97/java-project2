package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();

        System.out.printf("%.1f MB", h * b * c * s / (1024 * 1024 * 8.0));
    }
}
