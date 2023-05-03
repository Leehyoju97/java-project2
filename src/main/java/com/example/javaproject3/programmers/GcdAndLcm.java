package com.example.javaproject3.programmers;

public class GcdAndLcm {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int[] result = s.solution(3, 12);

        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution12 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m, answer[0]);

        return answer;
    }

    public static int getGCD(int num1, int num2) {
        return (num1 % num2 == 0) ? num2 : getGCD(num2, num1 % num2);
    }

    public static int getLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }
}
