package com.example.javaproject3.week5.day1;

import java.util.Arrays;

public class BubbleSort01 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
