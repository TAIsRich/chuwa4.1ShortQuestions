package com.dfy.pattern.singleton.demo8;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 5:40 PM
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
