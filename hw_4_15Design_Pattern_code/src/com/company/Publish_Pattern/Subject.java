package com.company.Publish_Pattern;

public interface Subject {
    //增加订阅者
    public void attach(Observer observer);
    //删除订阅者
    public void detach(Observer observer);
    //通知订阅者更新消息
    public void notify(String message);
}
