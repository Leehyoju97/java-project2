package com.example.javaproject3.week4.day4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface GetLines {
    List<String> getLines(String fileName) throws IOException;
}
