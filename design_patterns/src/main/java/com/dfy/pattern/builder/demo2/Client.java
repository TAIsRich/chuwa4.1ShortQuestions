package com.dfy.pattern.builder.demo2;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 5:26 PM
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("San Xing")
                .mainBoard("Hua Shuo")
                .memory("Jin Shi Dun")
                .build();

        System.out.println(phone);

    }
}
