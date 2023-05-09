package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1098 {

    public static void main(String[] args) {
        input();
    }

    private static void input () {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[h][w];

        coverBar(sc, n, matrix);
        print(matrix, h, w);
    }

    private static void coverBar (Scanner sc, int n, int[][] matrix) {

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 가로
            if (d == 0) {
                for (int j = y - 1; j < y - 1 + l; j++) {
                    matrix[x - 1][j] = 1;
                }
                // 세로
            } else if (d == 1) {
                for (int j = x - 1; j < x - 1 + l; j++) {
                    matrix[j][y - 1] = 1;
                }
            }
        }
    }

    private static void print(int[][]matrix, int h, int w)
    {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
