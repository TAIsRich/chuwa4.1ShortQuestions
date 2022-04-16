package com.chuwa.design.patterns.demo7;

public class Singleton {
    // private constructor
    private Singleton(){}

    // static inner class
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    // public access method
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
