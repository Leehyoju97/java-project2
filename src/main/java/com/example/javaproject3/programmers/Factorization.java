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
    public int[] solution (int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
