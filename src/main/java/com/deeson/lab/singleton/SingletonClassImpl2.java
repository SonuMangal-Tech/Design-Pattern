package com.deeson.lab.singleton;

//  Singleton Design Pattern With Lazy Instantiation ie create instance on demand only
public class SingletonClassImpl2 {
    private static SingletonClassImpl2 object;

    // Make ctor private
    private SingletonClassImpl2() {

    }

    public static SingletonClassImpl2 getInstance() {
        if (object == null) {
            object = new SingletonClassImpl2();
        }
        return object;
    }

}
/*
	Problem:
	>> Although, we have done performance optimization for singleton design pattern with lazy initialization but
		still there are certain problems
	>> So, before we start coding singleton class in a multi-threaded environment we should understand problem
		with lazy initialization first
	>> In the above example for Lazy Initialization, suppose 2 or more threads execute in parallel or concurrent,
		then there may be a issue with multiple instances being instantiated.
*/