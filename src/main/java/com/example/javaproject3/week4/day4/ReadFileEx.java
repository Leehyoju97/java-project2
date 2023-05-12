package com.example.javaproject3.week4.day4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public ReadFileEx(GetLines getlines, String fileName) throws IOException {
        this.list = getlines.getLines(fileName);
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\dlgyw\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\hospital_info_0920_utf8.csv";
        ReadFileEx readFileEx = new ReadFileEx(new FileNewBr(),fileName);
        ReadFileEx readFileEx2 = new ReadFileEx(new FileWithInputStreamReader(),fileName);

        List<String> list = readFileEx.getList();
        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }
    }
}


