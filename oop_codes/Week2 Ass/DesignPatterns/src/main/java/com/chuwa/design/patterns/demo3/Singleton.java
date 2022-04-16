package com.chuwa.design.patterns.demo3;

public class Singleton {
    // lazy loading

    // private constructor
    private Singleton(){}

    //create an instance
    private static Singleton instance;

    // public methods to create or access the instance
    // use if to make sure only one instance is created
    // synchronized (lock) is to keep multithreading safe
    public static synchronized Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }else{
            return instance;
        }
    }


}
