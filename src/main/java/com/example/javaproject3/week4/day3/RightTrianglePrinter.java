package com.example.javaproject3.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

    // System.out.   --> Console
    // BufferedWriter --> Console, File
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public void printToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        bw.append("aaa");
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter();
        rtp.printToFile();
    }
}






