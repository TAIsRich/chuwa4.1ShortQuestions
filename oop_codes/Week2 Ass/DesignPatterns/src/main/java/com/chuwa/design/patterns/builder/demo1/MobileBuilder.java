package com.chuwa.design.patterns.builder.demo1;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("carbon fiber");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("leather");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
