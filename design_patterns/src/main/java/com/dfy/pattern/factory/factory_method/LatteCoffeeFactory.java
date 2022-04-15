package com.dfy.pattern.factory.factory_method;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 12:06 AM
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
