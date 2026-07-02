package com.deeson.lab.decorator.ecommerce;

public class InsuranceDecorator extends ProductDecorator {
    public InsuranceDecorator(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + Insurance ";
    }

    @Override
    public double getCost() {
        return product.getCost() + 125;
    }
}
