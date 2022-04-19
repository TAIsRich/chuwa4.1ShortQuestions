package com.company.Singleton_Pattern.demo5;
//懒汉式-双重检查锁
public class Singleton {
    private Singleton(){}
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }

            }

        }
        return instance;
    }
}
