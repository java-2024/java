package com.example;

public class VariableTest2 {
    int a;
    void varTest(VariableTest2 test2){
        test2.a++;
    }
    public static void main(String[] args) {

        VariableTest2 test2 = new VariableTest2();
        test2.a=10;
        test2.varTest(test2);
        System.out.println(test2.a);
    }
}
