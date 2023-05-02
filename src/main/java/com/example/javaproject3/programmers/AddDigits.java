package com.example.javaproject3.programmers;

public class AddDigits {

    public static void main(String[] args) {
        int n = 123;

        Solution10 solution10 = new Solution10();
        int result = solution10.solution(n);
        System.out.println(result);
    }
}

class Solution10 {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
