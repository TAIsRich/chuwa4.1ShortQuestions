package com.dfy.pattern.factory.simple_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 11:37 PM
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
