package com.chuwa.design.patterns.demo1;

public class Client {
    public static void main(String[] args) {
        // create
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

    }
}
