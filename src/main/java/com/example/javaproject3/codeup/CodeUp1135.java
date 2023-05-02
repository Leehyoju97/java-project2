package com.example.javaproject3.codeup;

import java.io.*;

public class CodeUp1135 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int result = (a != b) ? 1 : 0;

        System.out.println(result);
    }
}
