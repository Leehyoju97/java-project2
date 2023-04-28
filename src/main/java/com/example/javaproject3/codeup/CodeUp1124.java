package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sArr = sc.next().split("H");
        sArr[0] = sArr[0].substring(1);

        int result = Integer.parseInt(sArr[0]) * 12 + Integer.parseInt(sArr[1]) * 1;
        System.out.println(result);
    }
}
