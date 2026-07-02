package com.deeson.lab.decorator.ecommerce;

public class MobilePhone implements Product {
    @Override
    public String getDescription() {
        return "Mobile Phone";
    }

    @Override
    public double getCost() {
        return 1000;
    }
}
