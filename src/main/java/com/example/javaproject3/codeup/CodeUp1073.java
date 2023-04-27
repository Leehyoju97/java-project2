package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sArr = sc.nextLine().split(" ");
        int i = 0;

        while (!sArr[i].equals("0")) {
            System.out.println(sArr[i]);
            i++;
        }
    }
}
