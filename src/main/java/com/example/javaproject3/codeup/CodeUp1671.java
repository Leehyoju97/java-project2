package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1671 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        int computer = sc.nextInt();
        String answer = "lose";

        if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
            answer = "win";
        } else if (user == computer) {
            answer = "tie";
        }

        System.out.println(answer);
    }
}
