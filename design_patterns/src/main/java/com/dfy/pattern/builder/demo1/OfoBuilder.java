package com.dfy.pattern.builder.demo1;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 10:27 AM
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("lu he jin che jia");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("xiang jiao che zuo");

    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
