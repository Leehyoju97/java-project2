package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(print(a));
        System.out.println(print(b));
        System.out.println(print(c));
    }

    public static String print(int num) {
        return (num % 2 == 1) ? "odd" : "even";
    }
}
