package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1278 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        while(n > 0) {
            cnt += 1;
            n /= 10;
        }

        System.out.println(cnt);
    }
}
