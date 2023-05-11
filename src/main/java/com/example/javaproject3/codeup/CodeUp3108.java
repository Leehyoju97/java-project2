package com.example.javaproject3.codeup;

import java.util.*;

public class CodeUp3108 {

    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int[] num = new int[5];

    public static void main(String[] args) {
        int n = sc.nextInt();
        input(n);
        sort();
        inputNumber();
        print();
    }

    public static void input(int n) {
        for (int i = 0; i < n; i++) {

            String code = sc.next();
            int number = sc.nextInt();
            String name = sc.next();

            Student student = new Student(code, number, name);

            if (student.getCode().equals("I") && isContain(student.getNumber())) {
                studentList.add(student);

            } else if (student.getCode().equals("D")) {
                for (int j = 0; j < studentList.size(); j++){
                    if (studentList.get(j).getNumber() == student.getNumber()) {
                        studentList.remove(j);
                        break;
                    }
                }
            }
        }
    }

    public static void sort() {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getNumber() > o2.getNumber()) return 1;
                else if (o1.getNumber() == o2.getNumber()) return 0;
                else return -1;
            }
        });
    }

    // 중복 검사
    public static boolean isContain(int number) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getNumber() == number) return false;
        }

        return true;
    }

    public static void inputNumber() {
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %s\n", studentList.get(num[i] - 1).getNumber(), studentList.get(num[i] - 1).getName());
        }
    }
}

class Student {
    private String code;
    private int number;
    private String name;

    public Student() {
    }

    public Student(String code, int number, String name) {
        this.code = code;
        this.number = number;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
