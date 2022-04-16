package com.dfy.pattern.builder.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 3:07 PM
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
