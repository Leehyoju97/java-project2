package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] str = s.split("\\.");

        System.out.printf("%s-%s-%s", str[2], str[1], str[0]);
    }
}
