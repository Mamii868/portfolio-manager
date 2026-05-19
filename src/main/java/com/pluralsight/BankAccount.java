package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private long accountNumber;
    private double balance;

    public BankAccount(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
