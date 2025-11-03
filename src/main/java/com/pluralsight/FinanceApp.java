package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApp {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        portfolio.addAsset(new BankAccount("Pam", 123, 12500));
        portfolio.addAsset(new BankAccount("Gary", 456, 1500));
        portfolio.addAsset(new Gold("Gold Bar", 2.5, 2000)); // weight, marketValue
        portfolio.addAsset(new Jewelry("Necklace", 1000, 18)); // marketValue, karat
        portfolio.addAsset(new House("Dream House", 250000, 2010, 3000, 4));
        portfolio.addAsset(new CreditCard("Visa", "987654321", 5000));

        System.out.println("Total value: $" + portfolio.getValue());
        System.out.println("Most valuable: " + portfolio.getMostValuable());
        System.out.println("Least valuable: " + portfolio.getLeastValuable());
    }
}
