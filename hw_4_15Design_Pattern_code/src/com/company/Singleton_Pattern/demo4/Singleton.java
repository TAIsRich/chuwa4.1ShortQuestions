package com.company.Singleton_Pattern.demo4;

//懒汉式（线程安全）
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}