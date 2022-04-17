package com.company.Factory_Pattern.demo2;

public class AmericanCoffeeFactory implements CoffeeFactory {
    public LatteCoffee createCoffee() {
        return new AmericanCoffee();
    }
}
