package com.example.inheritance;

public class Child extends Parent{
    public String value = "child";
    public String hello(){
        return "hello child";
    }
    public void call(){
        System.out.println("this value: "+ value); //this.value);
        System.out.println("super value:"+ super.value);
        System.out.println(this.hello()); // this 생략가능
        System.out.println(hello());
        System.out.println(super.hello());
    }
}
