package com.deeson.lab.factory.zomatocase;

public class ZomatoClient {
    public static void main(String[] args) {
        Dish pizzaDish = DishFactory.createOrder("PIZZA");
        pizzaDish.prepare();
        pizzaDish.serve();
    }
}
