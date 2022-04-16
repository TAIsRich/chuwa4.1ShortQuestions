package com.chuwa.design.patterns.publisher;



public interface Subject {
    // add subscriber/ observer
    void attach(Observer observer);

    void detach(Observer observer);

    // notify update
    void notify(String message);
}
