package com.example.javaproject3.programmers;

import java.util.Arrays;

public class SequenceAndQuery2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        Solution9 s = new Solution9();
        int[] result = s.solution(arr, queries);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution9 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    answer[i] = Math.min(answer[i], arr[j]);
                }
            }
            if (answer[i] == Integer.MAX_VALUE) answer[i] = -1;
        }
        return answer;
    }
}
