package com.dfy.pattern.factory.before;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 9:34 PM
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("No coffee");
        }
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
