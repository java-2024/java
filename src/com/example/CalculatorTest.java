package com.example;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        double result = cal.add(2.0, 3.0);
        System.out.println(result);
        double result2 = cal.sub(2.0, 3.0);
        System.out.println(result2);
        double result3 = cal.mul(2.0, 3.0);
        System.out.println(result3);
        double result4 = cal.div(2.0, 3.0);
        System.out.println(result4);
        double result5 = cal.pow(2.0, 3.0);
        System.out.println(result5);

    }//main

}
