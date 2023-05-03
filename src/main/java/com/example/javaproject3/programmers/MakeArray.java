package com.example.javaproject3.programmers;

import java.util.ArrayList;

public class MakeArray {

    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        Solution7 solution7 = new Solution7();
        int[] result = solution7.solution(l, r);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution7 {
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        int[] result = new int[(r - l) / 5];
        int idx = 0;

        for (int i = l; i <= r; i++) {
            boolean flag = true;
            int num = i;
            while (num > 0) {
                if ((num % 10) != 5 && (num % 10) != 0) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if (flag) {
                result[idx++] = i;
            }
        }

        if (idx == 0) {
            return answer;
        }

        answer = new int[idx];

        for (int i = 0; i < idx; i++) {
            answer[i] = result[i];
        }

        return answer;
    }
}
