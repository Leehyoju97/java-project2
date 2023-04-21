package com.example.javaproject3.week1.day5.practice;

public class SpaceInvader {
    private void moveLeft() {
        int location = 0;
        location = -1;
        System.out.printf("moveLeft:, %d\n", location);
    }

    private void moveRight() {
        int location = 0;
        location = 1;
        System.out.printf("moveright: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
    }
}