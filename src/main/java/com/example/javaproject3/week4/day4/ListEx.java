package com.example.javaproject3.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        l1.remove(0);
        l1.remove(0);
        System.out.println(l1.isEmpty());

        System.out.println("---------------");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 0;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
