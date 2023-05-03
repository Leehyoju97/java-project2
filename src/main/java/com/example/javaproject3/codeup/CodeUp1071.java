package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split(" ");
        int i = 0;
        String s = "";


        do {
            s = num[i];

            if (s.equals("0")) break;
            System.out.println(s);
            i++;
        } while (!s.equals("0"));
    }
}
