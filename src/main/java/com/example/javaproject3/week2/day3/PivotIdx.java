package com.example.javaproject3.week2.day3;

public class PivotIdx {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9};
        int pivot = arr.length / 2;
        System.out.printf("length:%d pivot:%d midValue:%d\n", arr.length,
                pivot, arr[pivot]);
        int[] arr2 = new int[]{3, 4, 6, 8};
        int pivot2 = arr2.length / 2;
        System.out.printf("length:%d pivot:%d midValue:%d\n",
                arr2.length, pivot2, arr2[pivot2]);
    }
}

