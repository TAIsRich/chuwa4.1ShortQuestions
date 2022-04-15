package com.dfy.pattern.singleton.demo7;

import java.io.*;

/**
 * @description: 测试使用反射破坏单例模式
 * @author: FY Dong
 * @date: 4/12/22 5:18 PM
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        readObjectFromFile();
        readObjectFromFile();

    }
    public static void readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/zoe/desktop/a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        System.out.println(instance);


    }

    public static void writeObject2File() throws Exception {
        //1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/zoe/desktop/a.txt"));
        //3. 写对象
        oos.writeObject(instance);
        //4. 释放资源
        oos.close();


    }
}

