package com.example;

public class Dog extends Animal{

    @Override
    public void say() {
        System.out.println("Dog says: 멍멍");
    }
    public static void main(String[] args) {
//        Dog dog = new Dog();
        Animal dog = new Dog();
        dog.setName("진돗개");
        System.out.println(dog.getName());
        dog.say();
    }
}
