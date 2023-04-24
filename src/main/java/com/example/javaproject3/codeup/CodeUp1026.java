package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] str = s.split(":");
        int num = Integer.parseInt(str[1]);

        if (num <= 9) {
            System.out.printf("%1d", num);
        } else {
            System.out.printf("%d", num);
        }
    }
}
