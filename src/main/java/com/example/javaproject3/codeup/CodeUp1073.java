package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            num = sc.nextInt();

            if (num == 0) break;
            System.out.println(num);

        } while (num != 0);
    }
}
