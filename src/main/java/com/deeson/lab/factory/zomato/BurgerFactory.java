package com.deeson.lab.factory.zomato;

public class BurgerFactory implements DishFactory {
    @Override
    public Dish createOrder() {
        return new Burger();
    }
}
