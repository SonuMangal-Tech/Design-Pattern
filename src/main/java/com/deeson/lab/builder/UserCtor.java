package com.deeson.lab.builder;

public class UserCtor {
    private int id;
    private String name;
    private int age;
    private String city;

    public UserCtor(int id) {
        this.id = id;
    }

    public UserCtor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserCtor(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }


}
