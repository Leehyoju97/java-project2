package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TenxTenFor {
    public static void main(String[] args) {
        int[][] arr10x10 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }


        System.out.println("===============");

        int[][] arr32 = new int[3][2]; // 3*2 형태의 배열
        int[][] arr67 = new int[6][7]; // 6*7 형태의 배열

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr32[i]));
        }


    }
}
