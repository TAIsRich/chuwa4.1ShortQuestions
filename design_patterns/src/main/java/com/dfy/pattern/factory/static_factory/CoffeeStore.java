package com.dfy.pattern.factory.static_factory;


/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 9:34 PM
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

       Coffee coffee = SimpleCoffeeFactory.creatCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
