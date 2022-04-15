package com.dfy.pattern.oberver;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: concrete subject
 * @author: FY Dong
 * @date: 4/14/22 5:57 PM
 */
public class SubscriptionSubject implements Subject {


    // 定义一个集合，用来存储多个observer对象

    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);

    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }

    }
}
