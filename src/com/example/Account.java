package com.example;

public class Account {
    private int amount; // 입출금 금액을 나타내는 멤버변수(인스턴스변수)
    private static int balance;//잔액을 나타내는 정적변수(클래스변수),공유변수 용도

    // 입금 메서드 , 통장에 잔액이 만원, 만원을 입급합니다.
    public void deposit(int depositAmount) {
        amount = depositAmount;
        balance += amount; // balance = 만원 +만원 = 이만원
        System.out.println(amount+" 원이 입금되었습니다.");
    }
    // 출금 메서드, 1만원출금, 2만원
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= balance) {
            amount = withdrawAmount;
            balance -= amount;  // 만원
            System.out.println(amount + " 원이 출금되었습니다.");
        }else{
            System.out.println("잔액 부족.");
        }
    }
    // 잔액 조회 메서드
    public void checkBalance() {
        System.out.println("현재 잔액은 "+ balance +"입니다.");
    }
}
