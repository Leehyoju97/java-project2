package com.example.javaproject3.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelloPrinter implements StringPrinter {
    @Override
    public void print(String str) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(str);
        bw.flush();;
        bw.close();
    }
}
