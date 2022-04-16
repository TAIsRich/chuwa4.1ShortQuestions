package com.dfy.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 5:40 PM
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2. 获取无参构造方法
        Constructor cons = clazz.getDeclaredConstructor();
        //3. 取消访问检查
        cons.setAccessible(true);
        //4. 创建Singleton对象
        Singleton s1= (Singleton) cons.newInstance();
        Singleton s2= (Singleton) cons.newInstance();

        System.out.println(s1 == s2);


    }
}
