package com.example;

class Updater{
    void update(Counter counter){
        counter.count++;
    }
}
class Counter{
    int count=100; // 객체변수
}

public class Sample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("before update :" + counter.count);
        Updater updater = new Updater();
//        updater.update(counter.count);
        updater.update(counter);
        System.out.println("after update :" + counter.count);
    }
}
