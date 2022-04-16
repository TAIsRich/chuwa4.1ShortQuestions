package com.dfy.pattern.singleton.demo3;

/**
 * @description: lazy initialization
 * @author: FY Dong
 * @date: 4/12/22 12:55 PM
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance; //只是声明了变量，并没有进行赋值

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            //线程1等待，线程2获取到cpu的执行权，也会进入到该判断里，如果有synchronized，就进不来
            instance = new Singleton();
        }
        return instance;


    }
}
