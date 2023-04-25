package com.example.javaproject3.week2.day2;

import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[3]; // 세 칸 배열 생성
        iArr[0] = 2;
        iArr[1] = 3;
        System.out.println(iArr);
        System.out.println(iArr[0]);

        System.out.println(Arrays.toString(iArr));

        int[] iArr2 = new int[] {1, 2, 3, 8};
        System.out.printf("%d %d %d %d\n", iArr2[0], iArr2[1], iArr2[2], iArr2[3]);

        int[] iArr3 = {10, 11, 12};
        System.out.printf("%d %d %d\n", iArr3[0], iArr3[1], iArr3[2]);

        float[] fArr = new float[3];
        String[] sArr = new String[3];

        System.out.println(fArr[0]);
        System.out.println(sArr[0]);
    }
}

