package com.example;

public class MethodTest {
// https://github.com/java-2024/java.git
    // 메서드 4가지 유형
    // 1. 입력X, 리턴X
    void say1(){
        System.out.println("Hello World");
        return;
    }
    //2. 입력O, 리턴X
    void say2(String name){
        System.out.println("Hi "+ name);
        return;
    }
    //3. 입력X, 리턴O
    String say3(){
        return "Hi";
    }
    //4. 입력O, 리턴O
    String say4(String name){
        return "Hi "+name;
    }
    public static void main(String[] args) {

        MethodTest mt = new MethodTest();
        mt.say1();
        mt.say2("hong");
        String result =mt.say3();
        System.out.println(result);
        System.out.println(mt.say4("choi"));
    }
}
