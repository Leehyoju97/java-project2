package com.example.javaproject3.programmers;

import java.util.HashSet;

public class Factorization {

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int[] result = solution13.solution(12);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution13 {
    public int[] solution(int n) {
        int[] arr = new int[n + 1];
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
