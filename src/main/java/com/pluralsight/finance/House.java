package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt, squareFt, bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFt, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFt = squareFt;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        double bonus = (bedrooms * 10000) + (squareFt * 50);
        return getMarketValue() + bonus;
    }

    @Override
    public String toString() {
        return getName() + " (House, " + bedrooms + " beds, " + squareFt + " sq ft) - Value: $" + getValue();
    }
}
