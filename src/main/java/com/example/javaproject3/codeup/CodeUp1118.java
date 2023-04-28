package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double width = a * b / 2.0;

        System.out.printf("%.1f", width);
    }
}
