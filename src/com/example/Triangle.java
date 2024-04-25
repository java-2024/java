package com.example;

public class Triangle extends Shape{
    @Override
    public double area(int width, int height) {
        double result = (width*height)/2;
        return result;
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        double result = tri.area(3,4);
        System.out.println(result);

    }
}
