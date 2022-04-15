package com.dfy.pattern.oberver;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/14/22 6:10 PM
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建公众号
        SubscriptionSubject subject = new SubscriptionSubject();

        // 2. 订阅公众号
        subject.attach(new WeiXinUser("dfy"));
        subject.attach(new WeiXinUser("zlz"));
        subject.attach(new WeiXinUser("Buffy"));

        // 3. 公众号更新，发出信息给observers

        subject.notify("updates!!!!!!");

    }
}
