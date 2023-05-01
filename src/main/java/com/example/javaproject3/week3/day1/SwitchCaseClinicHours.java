package com.example.javaproject3.week3.day1;

public class SwitchCaseClinicHours {
    public static void main(String[] args) throws IllegalAccessException {
        String day = "월";
        String time = switch(day) {
            case "월", "화", "목", "금" -> "09:30-18:30";
            case "토" -> "09:30-13:00";
            case "수", "일" -> "휴진";
            default -> throw new IllegalAccessException("잘못된 입력");
        };
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
