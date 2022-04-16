package com.company.Singleton_Pattern.demo1;

public class Client {
    public static void main(String[] args) {
        singletonPattern instance = singletonPattern.getInstance();
        singletonPattern instance1 = singletonPattern.getInstance();
        System.out.println(instance == instance1);
    }
}
