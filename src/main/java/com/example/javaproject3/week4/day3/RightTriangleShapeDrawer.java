package com.example.javaproject3.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        int number = rightTriangle.input();
        rightTriangle.printShape(number);
    }
}
