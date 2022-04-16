package com.company.Singleton_Pattern.demo2;
//饿汉式：静态代码块
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
