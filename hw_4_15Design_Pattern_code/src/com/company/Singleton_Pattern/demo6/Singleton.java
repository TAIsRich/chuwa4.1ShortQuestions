package com.company.Singleton_Pattern.demo6;
//懒汉式-静态内部类方式
public class Singleton {
    private Singleton(){}
    private static class singletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return singletonHolder.INSTANCE;
    }
}
