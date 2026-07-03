package com.deeson.lab.builder;

public class Client {
    public static void main(String[] args) {
        // Multiple ctor for multiple fields
        UserCtor userCtor = new UserCtor(11);
        UserCtor userCtor2 = new UserCtor(11, "Deeson");
        UserCtor userCtor4 = new UserCtor(11, "Deeson", 32, "Noida");

        // Dynamic fields
        UserBuilder builder = new UserBuilder.Builder()
                .id(12)
                .name("deeson lab")
                .city("Noida")
                .build();
    }
}
