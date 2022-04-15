package com.dfy.pattern.oberver;

/**
 * @description: abstract subject
 * @author: FY Dong
 * @date: 4/14/22 5:53 PM
 */
public interface Subject {

    //add observers/subscribers
    void attach(Observer observer);

    //delete observers
    void detach(Observer observer);

    //notify observer the updates

    void notify(String message);

}
