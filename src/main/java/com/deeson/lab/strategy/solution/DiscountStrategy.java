package com.deeson.lab.strategy.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DiscountStrategy {
    private static Map<String, Supplier<Discount>> map = new HashMap<String, Supplier<Discount>>() {
        {
            put("FESTIVE", FestiveDiscount::new);
            put("PREMIUM", PremiumUserDiscount::new);
        }
    };

    Discount discount;

    public DiscountStrategy(Discount discount) {
        this.discount = discount;
    }

    public static double processDiscount(String type, int amount) {
        return map.get(type).get().applyDiscount(amount);
    }

}
