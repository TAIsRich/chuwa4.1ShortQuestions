package com.company.Singleton_Pattern.demo3;

import com.company.Singleton_Pattern.demo2.Singleton;

public class Client {
    public static void main(String[] args) {
        com.company.Singleton_Pattern.demo2.Singleton instance = com.company.Singleton_Pattern.demo2.Singleton.getInstance();
        com.company.Singleton_Pattern.demo2.Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);

    }
}
