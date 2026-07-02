package com.deeson.lab.factory.zomato;

public class ZomatoClient {
    public static void main(String[] args) {
        DishFactory factory = new BurgerFactory();
        Dish dish = factory.createOrder();
        dish.prepare();
        dish.serve();

        factory = new PizzaFactory();
        Dish pizzaDish = factory.createOrder();
        pizzaDish.prepare();
        pizzaDish.serve();
    }
}
