package com.example.javaproject3.programmers;

public class SequenceAndQuery3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        Solution6 solution6 = new Solution6();
        int[] result = solution6.solution(arr, queries);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution6 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int i = 0; i < queries.length; i++) {
            int index1 = queries[i][0];
            int index2 = queries[i][1];

            int temp = answer[index1];
            answer[index1] = answer[index2];
            answer[index2] = temp;
        }

        return answer;
    }
}