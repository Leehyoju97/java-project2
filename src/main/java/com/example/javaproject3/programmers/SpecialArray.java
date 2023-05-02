package com.example.javaproject3.programmers;

public class SpecialArray {

    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        Solution8 s = new Solution8();
        int result = s.solution(arr);
        System.out.println(result);
    }
}

class Solution8 {
    public int solution(int[][] arr) {
        int answer = 1;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i != j && arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
