package com.example.book;

interface  Predator{
    String bark();
}
abstract class Animal{
    public String hello(){
        return "hello";
    }
}
class Dog extends Animal{
}
class Lion extends Animal implements Predator{
    @Override
    public String bark() {
        return "Bark bark!!";
    }
}
public class Sample {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

        System.out.println(a.hello());
//        System.out.println(a.bark());
        System.out.println(b.hello());
        System.out.println(b.bark());
//        System.out.println(c.hello());
        System.out.println(c.bark());

    }
}
