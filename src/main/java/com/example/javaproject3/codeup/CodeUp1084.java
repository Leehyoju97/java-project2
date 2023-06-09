package com.example.javaproject3.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                String str = "";

                for (int k = 0; k < b; k++) {
                    str += i+" "+j+" "+k+"\n";
                    count++;
                }

                bw.write(str);
                bw.flush();
            }
        }

        System.out.println(count);
    }
}
