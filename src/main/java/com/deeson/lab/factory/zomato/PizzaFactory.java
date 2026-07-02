package com.deeson.lab.factory.zomato;

public class PizzaFactory implements DishFactory {
    @Override
    public Dish createOrder() {
        return new Pizza();
    }
}
