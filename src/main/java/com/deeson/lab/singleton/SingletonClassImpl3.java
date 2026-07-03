package com.deeson.lab.singleton;

// In case of multithreading environment,
// suppose multiple thread are request for instance then using synchronized Method, (Lock and Unlock)
// it will run single request at a time
public class SingletonClassImpl3 {
    private static SingletonClassImpl3 object;

    private SingletonClassImpl3() {

    }

    // Entire method are synchronized
    synchronized public static SingletonClassImpl3 getInstance() {
        if (object == null) {
            object = new SingletonClassImpl3();
        }
        return object;
    }

    // Block of code are synchronized
    /*public static SingletonClassImpl3 getInstance2() {
        synchronized (SingletonClassImpl3.class) {
            if (object == null) {
                object = new SingletonClassImpl3();
            }
        }
        return object;
    }*/
}

/*     Suppose 2 thread call getInstance() method, T1 will be locked by synchronized and check object
        is null, then create Object for this and then unlock T1.
        Once T1 unlock the method, then T2 will be locked and check for object is null or null. If not, then
        return same instance to T2 and unlock the method.


 *       Problem: Thread 1 get the instance and use them till that time, it will lock for other thread,
 *       because of this synchronized. others thread will wait for their turn.
 * */