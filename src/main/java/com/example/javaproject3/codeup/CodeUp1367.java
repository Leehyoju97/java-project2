package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1367 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.printf(" ");
            }

            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
