package com.example.javaproject3.week1.day5.CodeUp;

import java.util.Scanner;

public class CodeUp1024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("");

        for (String s : str) {
            System.out.printf("'%s'\n", s);
        }
    }
}
