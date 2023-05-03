package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1274 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                cnt++;
                break;
            }
        }

        System.out.println((cnt == 0) ? "prime" : "not prime");
    }
}
