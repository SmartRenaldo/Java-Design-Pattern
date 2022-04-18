package com.x.pattern.observer;

/**
 * 抽象主题类
 * @author Yiqi Li
 */
public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     */
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notify(String message);
}
