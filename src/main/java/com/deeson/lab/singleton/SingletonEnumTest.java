package com.deeson.lab.singleton;

public class SingletonEnumTest {

    public static void main(String[] args) {
        SingletonEnum test = SingletonEnum.INSTANCE;
        SingletonEnum testq = SingletonEnum.INSTANCE;
        System.out.println(test.hashCode());
        System.out.println(testq.hashCode());
    }
}

