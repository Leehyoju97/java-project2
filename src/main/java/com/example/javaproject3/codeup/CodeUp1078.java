package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1078 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += (i % 2 == 0) ? i : 0;
        }

        System.out.println(sum);
    }
}
