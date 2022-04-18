package com.x.pattern.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.subscribe(new WeChatUser("Tom"));
        subject.subscribe(new WeChatUser("Max"));
        subject.subscribe(new WeChatUser("Caroline"));

        subject.notify("Column updated!");
    }
}
