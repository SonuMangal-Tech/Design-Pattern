package com.deeson.lab.strategy.solution;

public class NoDiscount implements Discount {
    @Override
    public double applyDiscount(int amount) {
        return amount;
    }
}
