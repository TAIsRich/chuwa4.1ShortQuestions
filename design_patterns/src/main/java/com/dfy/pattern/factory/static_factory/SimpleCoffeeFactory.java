package com.dfy.pattern.factory.static_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 11:22 PM
 */
public class SimpleCoffeeFactory {

    public static Coffee creatCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("no coffee!");
        }
        return coffee;

    }

}
