package com.deeson.lab.decorator.ecommerce;

public abstract class ProductDecorator implements Product {
    Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }

    @Override
    public double getCost() {
        return product.getCost();
    }
}
