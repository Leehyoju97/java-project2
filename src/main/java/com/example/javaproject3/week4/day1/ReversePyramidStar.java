package com.example.javaproject3.week4.day1;

import java.util.Scanner;

public class ReversePyramidStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("#");
            }

            for (int j = 1; j <= n * 2 - 1 - 2 * (i - 1); j++) {
                System.out.printf("*");
            }

            for (int j = 1; j < i; j++) {
                System.out.printf("#");
            }
            System.out.println();
        }

    }
}
