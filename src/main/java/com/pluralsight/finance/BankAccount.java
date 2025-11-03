package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }

    @Override
    public String toString() {
        return name + "'s BankAccount (Acc#: " + accountNumber + ") - $" + balance;
    }
}
