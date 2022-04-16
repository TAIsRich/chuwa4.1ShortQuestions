package com.chuwa.pattern.factory.simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        // create a SimpleCoffeeFactory instance
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // invoke createCoffee method to create a new Coffee
        Coffee coffee = factory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
