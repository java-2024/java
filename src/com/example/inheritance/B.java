package com.example.inheritance;

public class B extends A {
    String name;

    public B() {
        super(); // 부모생성자(A) 호출
        this.name ="ClassB 디폴트 생성자 호출";
        System.out.println(super.name);
    }
}
