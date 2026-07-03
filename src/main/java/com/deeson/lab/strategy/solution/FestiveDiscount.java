package com.deeson.lab.strategy.solution;

public class FestiveDiscount implements Discount {
    @Override
    public double applyDiscount(int amount) {
        return amount * 0.5;
    }
}
