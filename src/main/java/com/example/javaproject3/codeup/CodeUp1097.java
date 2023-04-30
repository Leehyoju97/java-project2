package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1097 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[20][20];

        for (int i = 1; i < 20; i++) {

            for (int j = 1; j < 20; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 1; j <= 19; j++) {
                arr[x][j] = (arr[x][j] == 0) ? 1 : 0;
            }

            for (int j = 1; j <= 19; j++) {
                arr[j][y] = (arr[j][y] == 0) ? 1 : 0;
            }
        }


        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
