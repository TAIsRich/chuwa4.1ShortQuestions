package com.dfy.pattern.singleton.demo5;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 1:34 PM
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);

    }
}
