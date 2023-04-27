package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        print(num);
    }

    public static void print(int num) {

        if (num > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
            num = -num;
        }

        System.out.println((num % 2 == 1) ? "odd" : "even");
    }
}
