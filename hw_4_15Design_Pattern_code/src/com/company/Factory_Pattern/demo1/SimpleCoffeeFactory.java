package com.company.Factory_Pattern.demo1;

import com.company.Factory_Pattern.demo1.AmericanoCoffee;
import com.company.Factory_Pattern.demo1.Coffee;
import com.company.Factory_Pattern.demo1.LatteCoffee;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
