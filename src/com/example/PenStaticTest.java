package com.example;

public class PenStaticTest {
    public static void main(String[] args) {
        PenStatic.color ="red";
        PenStatic.price = 2000;

        PenStatic.writer(2);
        System.out.println(PenStatic.color);
        System.out.println(PenStatic.price);
    }
}
