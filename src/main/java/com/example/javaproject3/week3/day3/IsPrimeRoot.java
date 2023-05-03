package com.example.javaproject3.week3.day3;

import java.util.Scanner;

public class IsPrimeRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println((isPrime) ? "prime" : "not prime");
    }
}
