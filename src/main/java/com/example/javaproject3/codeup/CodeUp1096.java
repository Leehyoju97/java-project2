package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[][] arr = new int[20][20];

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            arr[x][y] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
