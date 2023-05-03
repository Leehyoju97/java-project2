package com.example.javaproject3.week3.day3;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                cnt++;
                break;
            }
        }

        System.out.println((cnt == 0) ? "prime" : "not prime");
    }
}
