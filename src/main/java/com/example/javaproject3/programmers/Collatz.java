package com.example.javaproject3.programmers;

import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        Solution2 solution2 = new Solution2();
        int result = solution2.solution(n);

        System.out.println(result);
    }
}

class Solution2 {
    public int solution(long num) {
        int count = 0;

        while(num != 1) {

            count++;

            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            if(count >= 500) {
                count = -1;
                break;
            }

        }

        return count;
    }
}
