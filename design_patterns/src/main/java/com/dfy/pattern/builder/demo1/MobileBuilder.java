package com.dfy.pattern.builder.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 10:24 AM
 */
public class MobileBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");


    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");

    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
