package com.example.javaproject3.week5.day3;

import java.util.EmptyStackException;

public class Stack1 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println("pointer = " + pointer);
    }

    public int pop() {
        if (!isEmpty()) {
            return arr[--pointer];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop());
        st.push(20);
        System.out.println(st.peek());
    }

}
