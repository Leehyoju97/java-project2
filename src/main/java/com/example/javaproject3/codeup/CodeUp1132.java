package com.example.javaproject3.codeup;

import java.io.*;

public class CodeUp1132 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(str);

        bw.flush();
    }
}
