package com.example.javaproject3.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class Codeup3108V2 {
    public class Student {
        private String code;
        private String testId;
        private String name;

        public Student(String code, String testId, String name) {
            this.code = code;
            this.testId = testId;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getTestId() {
            return testId;
        }

        public String getName() {
            return name;
        }
    }

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, String testId, String name){
        return new Student(code, testId, name);
    }

    public boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getCode().equals(student.getCode())) return true;
        }
        return false;
    }

    public void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(isExist(students.get(i))) students.remove(i);
        }
    }

    public void process(Student pStudent) {

        switch (pStudent.getCode()) {
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    public void addAStudent(Student student){
        if (!isExist(student)){
            students.add(student);
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }


    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        Codeup3108V2 codeup3108 = new Codeup3108V2();
        Student student = codeup3108.makeAStudent(splitted[0], splitted[1], splitted[2]);


        codeup3108.process(student);
        codeup3108.printStudents();


    }
}
