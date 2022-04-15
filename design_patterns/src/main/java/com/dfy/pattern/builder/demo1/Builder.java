package com.dfy.pattern.builder.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 10:22 AM
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
