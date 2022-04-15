package com.dfy.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 6:04 PM
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());


        //调用runtime的方法exec，参数是一个命令
        Process process = runtime.exec("ipconfig");

        // 调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];

        //读取数据
        int len = is.read(arr); // 返回读到的字节的个数

        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));





    }
}
