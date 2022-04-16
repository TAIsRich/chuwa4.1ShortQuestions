package com.dfy.pattern.factory.factory_method;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 12:03 AM
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
