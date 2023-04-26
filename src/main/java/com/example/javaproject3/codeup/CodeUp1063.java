package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = (num1 > num2) ? num1 : num2;

        System.out.println(answer);
    }
}
