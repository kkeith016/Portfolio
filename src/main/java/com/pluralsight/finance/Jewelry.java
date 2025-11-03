package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue() * (karat / 24);
    }

    @Override
    public String toString() {
        return getName() + " (Jewelry, " + karat + "k) - Value: $" + getValue();
    }
}
