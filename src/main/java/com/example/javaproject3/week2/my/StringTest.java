package com.example.javaproject3.week2.my;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "king";
        String str2 = "king";
        String str3 = new String("king");
        String str4 = "k";


        System.out.println("해쉬값 출력");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println("========================");
        System.out.println("== , equals메소드 비교");

        System.out.println(str1 == str2);   // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2 == str3); // false
        System.out.println(str2.equals(str3)); // true
        System.out.println(str1 == str4);   // false
        System.out.println(str1.substring(0, 1).equals(str4));  // true
    }
}
