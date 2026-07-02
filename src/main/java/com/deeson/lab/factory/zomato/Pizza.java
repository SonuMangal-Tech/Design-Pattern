package com.deeson.lab.factory.zomato;

public class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("Pizza Prepare");
    }

    @Override
    public void serve() {
        System.out.println("Pizza Serve");
    }
}
