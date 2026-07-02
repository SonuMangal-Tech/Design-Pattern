package com.deeson.lab.decorator.ecommerce;

public class GiftWrapDecorator extends ProductDecorator{
    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Gift Wrap ";
    }

    @Override
    public double getCost() {
        return product.getCost() + 5;
    }
}
