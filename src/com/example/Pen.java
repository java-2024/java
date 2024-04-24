package com.example;

public class Pen {
    private String color;
    private int price;
// 생성자가 하나도 없으면 자동으로 default 생성자가 만들어집니다.

    public Pen() {
    }

    public Pen(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void write(int count){
        for(int i=0; i<count; i++){
            System.out.print("Hello World!!");
        }
        return;
    }
}
