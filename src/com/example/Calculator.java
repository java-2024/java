package com.example;

public class Calculator {

    private double result;

    double add(double x, double y) {
        result = x + y;
        return result;
    }
    double sub(double x, double y) {
        result = x - y;
        return result;
    }
    double div(double x, double y) {
        result = x / y;
        return result;
    }
    double mul(double x, double y) {
        result = x * y;
        return result;
    }
    double pow(double x, double y) {
        result = Math.pow(x, y);
        return result;
    }
}
