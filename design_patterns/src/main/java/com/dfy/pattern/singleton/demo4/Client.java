package com.dfy.pattern.singleton.demo4;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 1:14 PM
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance = instance1);
    }

}
