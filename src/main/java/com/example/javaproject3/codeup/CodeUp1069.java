package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1069 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        String answer = "";

        switch (ch) {
            case 'A' :
                answer = "best!!!";
                break;
            case 'B' :
                answer = "good!!";
                break;
            case 'C' :
                answer = "run!";
                break;
            case 'D' :
                answer = "slowly~";
                break;
            default:
                answer = "what?";
        }

        System.out.println(answer);
    }
}
