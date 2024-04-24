package com.example;

public class VariableTest {
    void varTest(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {

        VariableTest vt = new VariableTest();
        int a = 10;
        vt.varTest(a);

        System.out.println(a);
    }
}
