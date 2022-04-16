package com.dfy.pattern.singleton.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 11:55 AM
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
        // if the two instances are the same

    }
}
