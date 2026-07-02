package com.deeson.lab.factory.zomatocase;

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
