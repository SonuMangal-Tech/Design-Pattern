package com.deeson.lab.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something...");
    }
}

// SingletonEnum test = SingletonEnum.INSTANCE;
// SingletonEnum.INSTANCE.doSomething();

/*
>> One Instance, per JVM. (Each JVM have 1 instance only)
>> By-default constructor are private.
>> enum are singleton only.
>> Reflection cannot break it
>> 👉 No need for synchronization, volatile, or double-checked locking.






* */