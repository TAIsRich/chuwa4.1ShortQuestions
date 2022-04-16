package com.dfy.pattern.singleton.demo4;

/**
 * @description: lazy initialization with Double check locking
 * @author: FY Dong
 * @date: 4/12/22 1:06 PM
 */
public class Singleton {

    private Singleton() {}

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        // first check, if instance is not null, 不需要抢占锁，直接return对象
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
