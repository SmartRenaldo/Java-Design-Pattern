package com.x.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    //store observer objects
    private List<Observer> weChatUsers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        weChatUsers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        weChatUsers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer weChatUser : weChatUsers) {
            weChatUser.update(message);
        }
    }
}
