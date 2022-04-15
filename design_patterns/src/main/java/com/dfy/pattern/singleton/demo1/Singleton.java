package com.dfy.pattern.singleton.demo1;

/**
 * @description: Eager initialization:
 * @author: FY Dong
 * @date: 4/12/22 11:47 AM
 */
public class Singleton {
    private Singleton() {}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
