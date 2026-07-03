package com.deeson.lab.strategy;

public class Strategy {
    public static double calculateDiscount(double amout, String type) {
        if ("FESTIVE".equals(type)) {
            return amout * 0.5;
        } else if ("PREMIUM".equals(type)) {
            return amout * 0.5;
        }
        return amout;
    }

}
