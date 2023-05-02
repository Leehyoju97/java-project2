package com.example.javaproject3.programmers;

public class SequenceAndQuery4 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        Solution11 solution11 = new Solution11();
        int[] result = solution11.solution(arr, queries);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution11 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    answer[j]++;
                }
            }
        }

        return answer;
    }
}
