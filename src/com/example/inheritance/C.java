package com.example.inheritance;

public class C extends B{
    String name;

    public C() {
        super(); //부모(B) 생성자 호출
        this.name = "ClassC 디폴트 생성자 호출";
        System.out.println(super.name);
    }
}
