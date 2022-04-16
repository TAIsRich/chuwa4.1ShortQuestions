package com.chuwa.design.patterns.demo2;

public class Singleton {
    // eager loading method 2: static methods block

    //private constructor
    private Singleton(){

    }
    //
    private static Singleton instance;

    //assign value in static method
    static {
        instance = new Singleton();
    }
    // public methods to get instance
    public static Singleton getInstance(){
        return instance;
    }
}
