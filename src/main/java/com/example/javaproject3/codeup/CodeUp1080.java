package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int index = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;

            index = i;

            if (sum >= n) break;
        }


        System.out.println(index);
    }
}
