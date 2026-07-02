package com.deeson.lab.factory.zomato;

public class Burger implements Dish {
    @Override
    public void prepare() {
        System.out.println("Burger Prepare");
    }

    @Override
    public void serve() {
        System.out.println("Burger Serve");
    }
}
