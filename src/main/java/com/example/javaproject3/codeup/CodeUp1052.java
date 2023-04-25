package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = (a != b) ? 1 : 0;

        System.out.println(answer);
    }
}
