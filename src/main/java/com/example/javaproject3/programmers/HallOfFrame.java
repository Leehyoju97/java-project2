package com.example.javaproject3.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class HallOfFrame {

    public static void main(String[] args) {

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        Solution3 solution3 = new Solution3();
        int[] result = solution3.solution(k, score);

        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}

class Solution3 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {

            if (tempList.size() < k) {
                tempList.add(score[i]);
                Collections.sort(tempList);
                answer[i] = tempList.get(0);
            } else if (tempList.size() == k) {
                int min = tempList.get(0);

                if (min < score[i]) {
                    tempList.remove(0);
                    tempList.add(score[i]);
                    Collections.sort(tempList);
                }

                answer[i] = tempList.get(0);
            }
        }

        return answer;
    }
}
