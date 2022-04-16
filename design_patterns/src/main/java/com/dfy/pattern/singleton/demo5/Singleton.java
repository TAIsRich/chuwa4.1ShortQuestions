package com.dfy.pattern.singleton.demo5;

/**
 * @description: 静态内部类方式
 * @author: FY Dong
 * @date: 4/12/22 1:30 PM
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
