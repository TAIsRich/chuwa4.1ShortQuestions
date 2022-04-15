package com.company.Factory_Pattern.demo2;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public LatteCoffee createCoffee() {
        return new LatteCoffee();
    }
}
