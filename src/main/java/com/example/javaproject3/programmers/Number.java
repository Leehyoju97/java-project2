package com.example.javaproject3.programmers;

public class Number {

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        Solution5 solution5 = new Solution5();
        int result = solution5.solution(num_list);

        System.out.println(result);
    }
}

class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for (int i : num_list) {
            if (i % 2 == 1) {
                odd += i;
            } else {
                even += i;
            }
        }

        answer += Integer.parseInt(odd) + Integer.parseInt(even);

        return answer;
    }
}
