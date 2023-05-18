package com.example.javaproject3.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack {

    public static void main(String[] args) {
        String brackets = "((((()))))";
        boolean result = solution(brackets);
        System.out.println(result);

        System.out.println("========================");

        System.out.println(solution2(brackets));
    }

    public static boolean solution(String brackets) {

        while (brackets.indexOf("()") != -1) {
            brackets = brackets.replace("()", "");
        }

        return brackets.length() == 0 ? true : false;
    }

    public static boolean solution2(String brackets) {

        while(brackets.indexOf("()")!= -1){
            String[] split = brackets.split("\\(\\)");
            brackets = String.join("",split);
            System.out.println(Arrays.toString(split));
            System.out.println(brackets);
        }

        return brackets.length() == 0 ? true : false;
    }
}
