package com.example.javaproject3.week4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class FileNewBr implements GetLines{
    @Override
    public List<String> getLines(String fileName) throws IOException {
        List<String> list = new LinkedList<>();

        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}