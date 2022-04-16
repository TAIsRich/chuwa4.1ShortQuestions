package com.chuwa.design.patterns.publisher;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeixinUser("Monkey King"));
        subject.attach(new WeixinUser("Pepa pig"));
        subject.attach(new WeixinUser("white horse"));

        subject.notify("there is update");
    }
}

