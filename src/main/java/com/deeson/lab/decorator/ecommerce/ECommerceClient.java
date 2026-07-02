package com.deeson.lab.decorator.ecommerce;

public class ECommerceClient {
    public static void main(String[] args) {
        Product product = new MobilePhone();
        product = new ExpressDeliveryDecorator(product);
        product = new GiftWrapDecorator(product);

        System.out.println(product.getDescription());
        System.out.println(product.getCost());
    }
}
