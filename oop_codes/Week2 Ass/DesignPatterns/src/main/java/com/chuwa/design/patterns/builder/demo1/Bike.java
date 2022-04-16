package com.chuwa.design.patterns.builder.demo1;

// product class
public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public Bike setFrame(String frame) {
        this.frame = frame;
        return this;
    }

    public String getSeat() {
        return seat;
    }

    public Bike setSeat(String seat) {
        this.seat = seat;
        return this;
    }
}
