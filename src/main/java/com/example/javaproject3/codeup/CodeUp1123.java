package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        double ftemp = (double)9 / 5 * c + 32;

        System.out.printf("%.3f", ftemp);
    }
}
