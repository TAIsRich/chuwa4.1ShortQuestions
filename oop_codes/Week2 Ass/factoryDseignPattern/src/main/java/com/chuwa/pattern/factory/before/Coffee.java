package com.chuwa.pattern.factory.before;

/**
 * @Description: Coffee class
 */
public abstract class Coffee {

    public abstract String getName();
    // add sugar
    public void addSugar(){
        System.out.println("add sugar");
    }

    // add sugar
    public void addMilk(){
        System.out.println("add milk");
    }
}
