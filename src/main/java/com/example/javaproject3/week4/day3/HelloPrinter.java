package com.example.javaproject3.week4.day3;

public class HelloPrinter {
    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다

    public void print(String message) {
        System.out.println(message);
    }

    public void repeatMessage(int n, String message) {
        for (int i = 0; i < n; i++) {
            print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.repeatMessage(5, "Hello");
    }
}


