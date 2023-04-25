package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double dnum = (double)a / b;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(String.format("%.2f", dnum));

    }
}
