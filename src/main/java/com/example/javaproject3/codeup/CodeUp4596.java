package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp4596 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = matrix[0][0];
        int xMax = 1;
        int yMax = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    xMax = i + 1;
                    yMax = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", xMax, yMax);

    }
}
