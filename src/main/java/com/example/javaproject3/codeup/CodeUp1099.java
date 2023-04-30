package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1099 {

    private static final int num = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int xIndex = 1;
        int yIndex = 1;

        while (true) {

            if (arr[xIndex][yIndex] == 2) {
                arr[xIndex][yIndex] = 9;
                break;
            } else if (arr[xIndex][yIndex] == 0) {
                arr[xIndex][yIndex] = 9;
            }

            if (arr[xIndex][yIndex + 1] == 0) {
                yIndex++;
            } else if (arr[xIndex][yIndex + 1] == 1) {
                xIndex++;
            }
        }

        arr[xIndex][yIndex] = 9;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%d ", arr[i][j]);
            }

            System.out.println();
        }
    }
}
