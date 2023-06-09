package com.example.javaproject3.week2.day1;

public class FloatAndDouble {

    public static void main(String[] args) {
        // float 변수 선언 및 초기화
        float f1 = 3.14f;
        float f2 = 1.23e10f;
        // double 변수 선언 및 초기화
        double d1 = 3.141592653589793;
        double d2 = 1.23e100;
        // float과 double 변수의 계산
        float result1 = f1 * 2.0f;
        double result2 = d1 / 2.0;
        // float과 double 변수의 출력
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println("======================================");

        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        Double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("d10 = " + d10);
    }
}
