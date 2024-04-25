package com.example.inheritance;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();

        ec.injectFuel(10000);
        gc.injectFuel(20000);

        ec.go();
        gc.go();
    }
}
