package com.dfy.pattern.builder.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 10:29 AM
 */
public class Director {

    private Builder builder;

    public Director (Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
