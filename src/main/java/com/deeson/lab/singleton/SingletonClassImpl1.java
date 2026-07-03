package com.deeson.lab.singleton;

// Singleton Design Pattern With Eager Initialization
// Also: Singleton pattern example with static factory method
public class SingletonClassImpl1 {
    private static final SingletonClassImpl1 singletonClass = new SingletonClassImpl1();

    private SingletonClassImpl1() {

    }

    public static SingletonClassImpl1 getInstance() {
        return singletonClass;
    }
}
/*
*  // Using static block

    public class Singleton {

     private Singleton() {
     }

     private static Singleton instance;

     static {
      try {
       instance = new Singleton();
      } catch (Exception e) {
       throw new RuntimeException("Failed to create singleton instance");
      }
     }

     public static Singleton getInstance() {
      return instance;
     }

    }

* */


/*
 * Problem: The above written code is very poor in terms of performance because
 * program returns singleton instance eagerly. i.e. it instantiates and keep
 * instance ready to be available even before asking to return
 *
 */

