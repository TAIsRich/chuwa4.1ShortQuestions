package com.chuwa.design.patterns.demo4;

public class Singleton {
    private Singleton(){

    }
    // volatile is to guarantee the double lock
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
