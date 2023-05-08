package com.example.javaproject3.week4.day1;

import java.util.Scanner;

public class RightTriangleRightAlignmentStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.printf(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
