package com.example.javaproject3.week4.day2;

public class Min extends MathCompare {

    @Override
    int get(int[] inputInt) {
        int min = inputInt[0];

        for (int i = 1; i < inputInt.length; i++) {

            if (min > inputInt[i]) {
                min = inputInt[i];
            }
        }

        return min;
    }
}
