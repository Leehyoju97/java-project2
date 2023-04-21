package com.example.javaproject3.week1.day5.practice;

public class Point {

    int x;
    int y;

    public boolean isSameXy() {
        return (x == y);
    }

    public double getDistance(Point p) {

        int dx = (p.x > x) ? p.x - x : x - p.x;
        int dy = (p.y > y) ? p.y - y : y - p.y;

        double sumOfPow = Math.pow(dx, 2) + Math.pow(dy, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
}
