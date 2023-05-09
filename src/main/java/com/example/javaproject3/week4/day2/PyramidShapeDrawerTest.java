package com.example.javaproject3.week4.day2;


public class PyramidShapeDrawerTest {

    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        System.out.println("==========================");

        ShapeDrawer parallelogramShapeDrawer = new ParallelogramShapeDrawer();
        parallelogramShapeDrawer.printShape(4);
    }
}