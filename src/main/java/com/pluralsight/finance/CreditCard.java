package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        if (amount > 0) balance += amount;
    }

    public void pay(double amount) {
        if (amount > 0) balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance; // Debt has negative value
    }

    @Override
    public String toString() {
        return name + " (CreditCard) - Balance: $" + balance;
    }
}
