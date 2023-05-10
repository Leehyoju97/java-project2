package com.example.javaproject3.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2 {

    public static String getRepeatedSymbol2(String symbol, int n) {
        return symbol.repeat(n);
    }

    @Override
    public String makeALine(int h, int i) {
        i = i - 1;
        int pivot = h / 2;
        return (i <= pivot) ? String.format("%s%s\n", getRepeatedSymbol2("0", pivot - i), getRepeatedSymbol2("*", 2 * i + 1)) : String.format("%s%s\n", getRepeatedSymbol2("0", i - pivot), getRepeatedSymbol2("*", 2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 diamondShapeDrawer = new DiamondShapeDrawer();
        int number = diamondShapeDrawer.input();
        diamondShapeDrawer.printShape(number);
    }
}
