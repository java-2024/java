package com.example.inheritance;

public class Car {
    private String model;
    private String color;

    public Car() {
        System.out.println("Car클래스 default생성자 호출");
    }

    public void go() {
        System.out.println("자동차는 달립니다.");
    }
    public void injectFuel(int money){
        System.out.println("연료를 주입 받다.");
    }
    public void openDoor(){
        System.out.println("자동차 문을 엽니다.");
    }
}
