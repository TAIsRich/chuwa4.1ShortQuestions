package com.chuwa.design.patterns.publisher;

public class WeixinUser implements  Observer{

    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + " " + message);
    }

    public WeixinUser (String name){
        this.name = name;

    }
}
