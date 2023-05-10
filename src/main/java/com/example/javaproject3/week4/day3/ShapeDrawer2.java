package com.example.javaproject3.week4.day3;

import java.util.Scanner;

public abstract class ShapeDrawer2 {

    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }

    public int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}


