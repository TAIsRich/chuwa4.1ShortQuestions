package com.dfy.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * @description: 测试使用反射破坏单例模式
 * @author: FY Dong
 * @date: 4/12/22 5:18 PM
 */
public class Singleton implements Serializable {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
