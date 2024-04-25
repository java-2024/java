package com.example.inheritance;

public class ElectricCar extends Car{
    public ElectricCar() {
        System.out.println("전기차 default 생성자 호출");
    }

    @Override
    public void injectFuel(int money) {
        System.out.println("전기 충전완료.");
    }

    @Override
    public void go() {
        System.out.println("전기차가 달립니다.");
    }
}
