package com.example.javaproject3.week2.day3;

import java.util.Arrays;
public class TwoDimArrFillRow {

    public static void fillARow(int[][] arr, int rowNum) {
        arr[rowNum][0] = 1; // 2행 0열에 값 할당
        arr[rowNum][1] = 1; // 2행 1열에 값 할당
        arr[rowNum][2] = 1; // 2행 2열에 값 할당
        arr[rowNum][3] = 1; // 2행 3열에 값 할당
        arr[rowNum][4] = 1; // 2행 4열에 값 할당
        print(arr);
    }


    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillARow(arr, 1);
        fillARow(arr, 2);
    }

    static void print(int[][] arr) {
        System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("=========================");
    }
}

