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
        // 가변인자받아 합계구하는 함수 sumArgs()호출
        double sum1 = cal.sumArgs(1, 2, 3, 4, 5);
        double sum2 = cal.sumArgs(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum1);
        System.out.println(sum2);

    }//main

}
