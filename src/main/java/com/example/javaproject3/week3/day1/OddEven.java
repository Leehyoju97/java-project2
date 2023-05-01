package com.example.javaproject3.week3.day1;

public class OddEven {

    public static void main(String[] args) {
        int[] odd = new int[5];
        int[] even = new int[5];

        int index1 = 0;
        int index2 = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1){
                odd[index1++] = i;
            } else {
                even[index2++] = i;
            }
        }

        for (int i = 0; i < odd.length; i++) {
            System.out.printf("%d ", odd[i]);
        }

        System.out.println();

        for (int i = 0 ; i < even.length; i++) {
            System.out.printf("%d ", even[i]);
        }
    }
}
