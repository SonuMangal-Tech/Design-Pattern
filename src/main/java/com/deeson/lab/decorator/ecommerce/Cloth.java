package com.deeson.lab.decorator.ecommerce;

public class Cloth implements Product{
    @Override
    public String getDescription() {
        return "Blazer";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
