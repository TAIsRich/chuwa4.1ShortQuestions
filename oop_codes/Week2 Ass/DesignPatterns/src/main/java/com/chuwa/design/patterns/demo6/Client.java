package com.chuwa.design.patterns.demo6;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance1 == instance);
    }
}
