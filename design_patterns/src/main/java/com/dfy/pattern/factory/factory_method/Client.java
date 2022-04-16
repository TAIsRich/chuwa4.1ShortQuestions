package com.dfy.pattern.factory.factory_method;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 11:37 PM
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
