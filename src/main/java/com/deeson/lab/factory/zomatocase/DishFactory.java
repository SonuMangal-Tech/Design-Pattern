package com.deeson.lab.factory.zomatocase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DishFactory {
    private static final Map<String, Supplier<Dish>> DISH_MAP = new HashMap<String, Supplier<Dish>>() {
        {
            put("PIZZA", Pizza::new);
            put("BURGER", Burger::new);
        }
    };

    public static Dish createOrder(String item) {
        Supplier<Dish> supplier = DISH_MAP.get(item.toUpperCase());

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid Dish Name");
        }
        return supplier.get();
    }
}
