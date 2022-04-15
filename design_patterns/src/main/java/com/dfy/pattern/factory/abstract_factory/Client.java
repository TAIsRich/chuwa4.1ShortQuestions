package com.dfy.pattern.factory.abstract_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/13/22 9:08 AM
 */
public class Client {
    public static void main(String[] args) {
        ItalianDessertFactory factory = new ItalianDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());

        dessert.show();

    }
}
