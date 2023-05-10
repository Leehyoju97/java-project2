package com.example.javaproject3.week4.day3;

import java.io.IOException;

public class HelloPrinter {

    private StringPrinter stringPrinter;

    public HelloPrinter(StringPrinter stringPrinter) {
        this.stringPrinter = stringPrinter;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            stringPrinter.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsoleHelloPrinter());
        hp.repeatMessage(5, "hello");
    }
}


