package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String grade = "";

        if (num >= 90 && num <=100) {
            grade = "A";
        } else if (num >=70 && num < 90) {
            grade = "B";
        } else if (num >= 40 && num < 70) {
            grade = "C";
        } else if (num >= 0 && num < 40) {
            grade = "D";
        }

        System.out.println(grade);
    }
}
