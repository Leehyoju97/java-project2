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

        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[r - l];

        for (int i = l; i <= r; i++) {

            int temp = i;

            while (temp > 0) {

                if (temp % 10 != 0 && temp % 10 != 5) {
                    break;
                }
            }
        }

        return result;
    }
}
