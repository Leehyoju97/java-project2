package com.example.javaproject3.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());
    }

    public void plusTwoNums() throws IOException {
        // InputStreamReader를 직접 넘겨 주는 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 두 값 더하기
        System.out.println(br.readLine() + br.readLine());
    }
}
