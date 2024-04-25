package com.example.inheritance;

public class GasCar extends Car {

    public GasCar() {
        System.out.println("가스차 default 생성자 호출.");
    }

    @Override
    public void injectFuel(int money) {
        System.out.println("가스 충전완료.");
    }

    @Override
    public void go() {
        System.out.println("가스차가 달립니다.");
    }
}
