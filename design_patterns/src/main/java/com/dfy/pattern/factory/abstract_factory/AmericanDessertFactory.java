package com.dfy.pattern.factory.abstract_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 9:02 AM
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
