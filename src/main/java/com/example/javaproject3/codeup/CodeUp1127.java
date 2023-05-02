package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1127 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double midPercent = sc.nextDouble();
        int midScore = sc.nextInt();

        double finalPercent = sc.nextDouble();
        int finalScore = sc.nextInt();

        double performPercent = sc.nextDouble();
        int performScore = sc.nextInt();

        double result = midPercent * midScore + finalPercent * finalScore + performPercent * performScore;

        System.out.printf("%.1f", result);
    }
}
