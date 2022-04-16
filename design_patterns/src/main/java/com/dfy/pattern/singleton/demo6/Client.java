package com.dfy.pattern.singleton.demo6;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 1:42 PM
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);



    }
}
