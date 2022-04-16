package com.chuwa.design.patterns.builder.demo1;

public class Director {
    // declare an builder variable
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //function to build a bike
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
