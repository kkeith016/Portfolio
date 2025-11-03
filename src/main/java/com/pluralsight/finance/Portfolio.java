package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Valuable> assets;

    public Portfolio() {
        assets = new ArrayList<>();
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) return null;

        Valuable most = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > most.getValue()) {
                most = asset;
            }
        }
        return most;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) return null;

        Valuable least = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < least.getValue()) {
                least = asset;
            }
        }
        return least;
    }
}
