package com.example.javaproject3.week5.day1;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void print(int[] arr) {

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("==========================");

    }

    // 버블 정렬 알고리즘은 거품처럼 큰 수부터 오른쪽부터 쌓인다.


    public static void sortByBubbleSort(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 4, 1, 3};

        sortByBubbleSort(arr1);
        print(arr1);
    }
}
