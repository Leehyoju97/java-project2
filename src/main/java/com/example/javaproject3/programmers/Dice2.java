package com.example.javaproject3.programmers;

public class Dice2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;

        Solution4 solution4 = new Solution4();
        int result = solution4.solution(a, b, c);

        System.out.println(result);
    }
}

class Solution4 {
    public int solution(int a, int b, int c) {
        int answer = calculate(a, b, c);

        return answer;
    }

    public int calculate (int a, int b, int c) {

        int result = 0;

        if ((a != b) && (b != c) && (c != a)) {
            result =  a + b + c;
        } else if (((a == b) && (a != c)) || ((a == c) && (b != c)) || ((b == c) && (a != c))) {
            result =  (a + b + c) * (a * a + b * b + c * c);
        } else if ((a == b) && (a == c) && (c == b)) {
            result =  (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }

        return result;
    }
}
