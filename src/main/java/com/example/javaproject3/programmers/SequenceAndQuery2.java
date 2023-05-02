package com.example.javaproject3.programmers;

import java.util.ArrayList;
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

        int aLength = arr.length;
        Arrays.sort(arr);
        int[] answer = new int[aLength];

        for (int i = 0; i < aLength; i++) {
            for (int j = queries[i][0]; j < queries[i][1]; j++) {
                System.out.println();
            }
        }

        return answer;
    }
}
