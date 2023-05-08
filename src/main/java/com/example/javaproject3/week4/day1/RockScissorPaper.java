package com.example.javaproject3.week4.day1;

import java.util.Scanner;

public class RockScissorPaper {

    public static boolean win(int user, int computer) {
        return (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int user = sc.nextInt();
            int computer = (int) (Math.random() * 2);
            System.out.println("computer = " + computer);

            if (win(user, computer)) {
                System.out.println("win");
                 break;
            }

            System.out.println("try again");
        }
    }
}
