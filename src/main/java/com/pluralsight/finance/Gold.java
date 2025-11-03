package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight, double marketValue) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue() * weight;
    }

    @Override
    public String toString() {
        return getName() + " (Gold, " + weight + " oz) - Value: $" + getValue();
    }
}
