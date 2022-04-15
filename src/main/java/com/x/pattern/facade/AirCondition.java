package com.x.pattern.facade;

/**
 * @author Yiqi Li
 */
public class AirCondition implements ElectricalApplication {
    @Override
    public void on() {
        System.out.println("打开空调................");
    }

    @Override
    public void off() {
        System.out.println("关闭空调................");
    }
}
