package com.deeson.lab.builder;

public class UserBuilder {
    private int id;
    private String name;
    private int age;
    private String city;

    UserBuilder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    static class Builder {
        private int id;
        private String name;
        private int age;
        private String city;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder build() {
            return new UserBuilder(this);
        }
    }
}
