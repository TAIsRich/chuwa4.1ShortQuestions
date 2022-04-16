package com.chuwa.design.patterns.demo1;

public class Singleton {
    // eager loading method 1: static fields
    // private constructor so that outside cannot access the constrcutor
    private Singleton(){

    }

    // create instance in current class
    private static Singleton instance = new Singleton();

    // provide a public method to create an instance
    public static Singleton getInstance(){
        return instance;
    }

}
