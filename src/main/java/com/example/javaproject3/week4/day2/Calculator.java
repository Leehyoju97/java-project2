package com.example.javaproject3.week4.day2;

public class Calculator {

    public static void plus() {
        System.out.println(1 + 1);
    }

    public static void printPlusOne(int num) {
        System.out.println(num + 1);
    }

    public static void printPlus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printMinus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void main(String[] args) {
        Calculator.printMinus(10, 20);
    }

}
