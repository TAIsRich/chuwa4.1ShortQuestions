package com.dfy.pattern.factory.config_factory;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/12/22 9:28 PM
 */
public abstract class Coffee {

    public  abstract String getName();

    public void addSugar() {
        System.out.println("Add Sugar");
    }

    public void addMilk() {
        System.out.println("Add Milk");
    }
}
