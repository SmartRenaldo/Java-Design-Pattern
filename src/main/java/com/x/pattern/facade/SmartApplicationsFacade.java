package com.x.pattern.facade;

/**
 * @author Yiqi Li
 */
public class SmartApplicationsFacade {
    private AirCondition airCondition;
    private Light light;
    private TV tv;

    public SmartApplicationsFacade() {
        this.airCondition = new AirCondition();
        this.light = new Light();
        this.tv = new TV();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            this.on();
        } else if (message.contains("关闭")) {
            this.off();
        } else {
            System.out.println("我听不懂你在说什么");
        }
    }

    private void on() {
        airCondition.on();
        light.on();
        tv.on();
    }

    private void off() {
        airCondition.off();
        light.off();
        tv.off();
    }
}
