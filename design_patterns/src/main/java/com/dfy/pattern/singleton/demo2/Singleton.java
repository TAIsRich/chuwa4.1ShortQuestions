package com.dfy.pattern.singleton.demo2;

/**
 * @description: Eager initialization: 静态代码块
 * @author: FY Dong
 * @date: 4/12/22 12:49 PM
 */
public class Singleton {
    private Singleton() {}

    private static Singleton instance; //null初始值

    //在静态代码中进行赋值

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
