package com.example;

public class Circle extends Shape {

    @Override
    public double area(int width, int height) {
        double result = width * height * Math.PI;
        return result;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double result = circle.area(10, 10);
        System.out.println(result);
    }
}
