package com.dfy.pattern.factory.simple_factory;


/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 9:34 PM
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.creatCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
