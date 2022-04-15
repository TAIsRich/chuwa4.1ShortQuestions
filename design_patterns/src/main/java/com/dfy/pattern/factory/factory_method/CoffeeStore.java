package com.dfy.pattern.factory.factory_method;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 12:01 AM
 */
public class CoffeeStore {

    private CoffeeFactory factory;
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee() {
        Coffee coffee = factory .createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
