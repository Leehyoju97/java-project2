package com.example.javaproject3.week3.day3;

public class Factor3 {

    public static void main(String[] args) {
        int n = 36;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
