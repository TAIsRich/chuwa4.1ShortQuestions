package com.dfy.pattern.oberver;

/**
 * @description: concrete observer
 * @author: FY Dong
 * @date: 4/14/22 6:07 PM
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }


}
