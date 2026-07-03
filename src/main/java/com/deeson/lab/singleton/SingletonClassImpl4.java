package com.deeson.lab.singleton;

// double-checked locking pattern
public class SingletonClassImpl4 {
    // volatile keyword: Multiple core have its own cache. When we initialize the variable then it will store
    // into cache. thread1 in core1 and tread2 in code 2.
    // volatile keyword will directly store into Main memory and also read from memory rather than cache.
    // that's get updated value.
    private static volatile SingletonClassImpl4 object;

    private SingletonClassImpl4(){

    }

    // synchronized block
    // double-checked locking pattern (by double condition)
    public static SingletonClassImpl4 getInstance(){
        if(object == null){
            synchronized (SingletonClassImpl4.class){
                if(object == null){
                    object = new SingletonClassImpl4();
                }
            }
        }
        return object;
    }
}