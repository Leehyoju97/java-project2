package com.example.javaproject3.week4.day2;

public class MathCompareTest {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 1};

        MathCompare mathCompare1 = new Max();
        int max = mathCompare1.get(numbers);

        MathCompare mathCompare2 = new Min();
        int min = mathCompare2.get(numbers);

        System.out.printf("max : %d\n", max);
        System.out.printf("min : %d\n", min);
    }
}
