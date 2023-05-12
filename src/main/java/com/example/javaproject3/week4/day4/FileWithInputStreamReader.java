package com.example.javaproject3.week4.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class FileWithInputStreamReader implements GetLines{
    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String> list = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"));
        String st;
        while((st = br.readLine()) != null) {
            list.add(st);
        }

        return list;
    }
}
