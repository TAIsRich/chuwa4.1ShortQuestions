package com.chuwa.design.patterns.demo7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) {

    }

    public static void writeObject2File(){
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c");

    }
}
