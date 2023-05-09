package com.example.javaproject3.week4.day2;

public class Max extends MathCompare {

    @Override
    int get(int[] inputInt) {
        int max = inputInt[0];

        for (int i = 1; i < inputInt.length; i++) {

            if (max < inputInt[i]) {
                max = inputInt[i];
            }
        }

        return max;
    }
}
