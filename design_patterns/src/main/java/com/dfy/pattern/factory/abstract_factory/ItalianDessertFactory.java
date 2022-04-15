package com.dfy.pattern.factory.abstract_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 9:03 AM
 */
public class ItalianDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
