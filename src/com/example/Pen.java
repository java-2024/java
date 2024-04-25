package com.example;

public class Pen {
    private String color;
    private int price;
// 생성자가 하나도 없으면 자동으로 default 생성자가 만들어집니다.
// 생성자 중복( 생성자 overloading): 멤버(인스턴스, 객체)변수를 초기화하는 역할
    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }
    public Pen() {
    }
    public Pen(String color) {
        this.color = color;
    }
    public Pen(int price) {
        this.price = price;
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
