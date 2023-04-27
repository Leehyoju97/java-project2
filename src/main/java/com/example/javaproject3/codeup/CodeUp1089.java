package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int result = a + (n - 1) * d;

        System.out.println(result);
    }
}
