package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split(" ");

        for (String s : num) {

            if (s.equals("0")) break;

            System.out.println(s);
        }
    }
}
