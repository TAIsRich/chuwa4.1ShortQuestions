package com.dfy.pattern.factory.before;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 9:40 PM
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStore store = new CoffeeStore();

        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());


    }
}
