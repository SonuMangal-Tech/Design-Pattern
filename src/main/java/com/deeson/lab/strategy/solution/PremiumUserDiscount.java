package com.deeson.lab.strategy.solution;

public class PremiumUserDiscount implements Discount {
    @Override
    public double applyDiscount(int amount) {
        return amount * 0.10;
    }
}
