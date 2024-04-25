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
    // 가변인자를 이용하여 숫자들의 합을 계산하는 메서드
    public double sumArgs(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
