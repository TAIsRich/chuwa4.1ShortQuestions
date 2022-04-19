package com.company.Singleton_Pattern.demo1;

//饿汉式：静态成员变量
public class singletonPattern {

    private singletonPattern(){}
    private static singletonPattern instance = new singletonPattern();
    public static singletonPattern getInstance(){
        return instance;
    }

}
