package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int xIndex = 1;
        int yIndex = 1;

        while (true) {

            // 먹이를 찾을 경우
            if (arr[xIndex][yIndex] == 2) {
                arr[xIndex][yIndex] = 9;
                break;
            }

            arr[xIndex][yIndex] = 9;

            // 옆으로 갈 수 있는 경우
            if (arr[xIndex][yIndex + 1] == 0 || arr[xIndex][yIndex + 1] == 2) {
                yIndex++;
                continue;

                // 옆이 막힌 경우
            } else if (arr[xIndex][yIndex + 1] == 1) {
                // 아래로 내려가야 되는 경우
                if (arr[xIndex + 1][yIndex] == 0 || arr[xIndex + 1][yIndex] == 2) {
                    xIndex++;
                    continue;

                    // 밑에도 막혀있는 경우
                } else if (arr[xIndex + 1][yIndex] == 1) {
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", arr[i][j]);
            }

            System.out.println();
        }
    }
}
