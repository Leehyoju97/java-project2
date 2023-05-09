package com.example.javaproject3.week4.day2;

public class ReversePyramid {
    public String makeALine(int h, int i) {
        return String.format("%s %s\n", " ".repeat(i - 1), "*".repeat(h * 2 - 1 - 2 * (i - 1)));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid();
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}
