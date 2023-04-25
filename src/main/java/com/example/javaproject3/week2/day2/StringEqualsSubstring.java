package com.example.javaproject3.week2.day2;

public class StringEqualsSubstring {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        String str3 = new String("GOLD");
        String str4 = "GOLD";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str1.substring(0,1) == str2);
        System.out.println(str1.substring(0, 1).equals(str2));
    }
}
