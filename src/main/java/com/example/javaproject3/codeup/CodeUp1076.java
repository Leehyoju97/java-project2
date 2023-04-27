package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        char ch = 'a';

        do {
            System.out.printf("%c ", ch);
            ch++;
        } while (ch <= c);
    }
}
