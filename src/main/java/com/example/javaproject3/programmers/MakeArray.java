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

        for (int i = 1; i < 64; i++) {
            String s = Integer.toBinaryString(i);
            int num = Integer.parseInt(s) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}
