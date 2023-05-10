package com.example.javaproject3.week4.day3;

import java.util.Scanner;

public class DrawDiamond2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int pivot = h / 2;

        for (int i = 0; i < h; i++) {
            if(i <= pivot){


                for (int j = 0; j < pivot - i; j++) {
                    System.out.print("0");
                }

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i - pivot; j++) {
                    System.out.print("0");
                }

                for (int j = 0; j < 2 * (h - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
