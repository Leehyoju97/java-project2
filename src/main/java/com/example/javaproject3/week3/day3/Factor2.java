package com.example.javaproject3.week3.day3;

public class Factor2 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d %% %d = %d\n", n, i, n % i);
            }
        }
    }
}
