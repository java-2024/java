package com.example;

public class AccountTest {
    public static void main(String[] args) {
        // Account 객체 생성
        Account account = new Account();
        //입금 수행
        account.deposit(10000);
        //잔액 조회
        account.checkBalance();
        // 출금 수행
        account.withdraw(5000);
        // 잔액 조회
        account.checkBalance();
        // 출금
        account.withdraw(10000);
    }// main
}
