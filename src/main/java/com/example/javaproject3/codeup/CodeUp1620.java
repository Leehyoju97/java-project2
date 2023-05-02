package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1620 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        while (temp >= 10) {
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
        }

        System.out.println(temp);
    }
}
