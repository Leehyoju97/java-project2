package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[5];
        int cnt = 1;

        for (int i = num.length - 1 ; i >= 0 ; i--) {
            num[i] = (n % 10) * cnt;
            n /= 10;
            cnt *= 10;
        }

        for (int i : num) {
            System.out.printf("[%d]\n", i);
        }
    }
}
