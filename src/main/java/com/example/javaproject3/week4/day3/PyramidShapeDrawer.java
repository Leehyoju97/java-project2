package com.example.javaproject3.week4.day3;

public class PyramidShapeDrawer extends ShapeDrawer2 {
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 pyramidShapeDrawer = new PyramidShapeDrawer();
        int number = pyramidShapeDrawer.input();
        pyramidShapeDrawer.printShape(number);
    }
}
