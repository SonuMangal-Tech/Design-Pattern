package com.deeson.lab.decorator.ecommerce;

public class ExpressDeliveryDecorator extends ProductDecorator {

    public ExpressDeliveryDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Express Delivery ";
    }

    @Override
    public double getCost() {
        return product.getCost() + 25;
    }
}
