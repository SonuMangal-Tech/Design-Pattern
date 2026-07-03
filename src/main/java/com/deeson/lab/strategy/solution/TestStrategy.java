package com.deeson.lab.strategy.solution;

// COns: at a time, only 1 coupon/discount will applicable

public class TestStrategy {
    public static void main(String[] args) {
        int productBasePrice = 1000;

        double discountPrice = DiscountStrategy.processDiscount("PREMIUM", productBasePrice);
        System.out.println(discountPrice);

        // Change strategy at runtime
        discountPrice = DiscountStrategy.processDiscount("FESTIVE", productBasePrice);
        System.out.println(discountPrice);

    }
}
