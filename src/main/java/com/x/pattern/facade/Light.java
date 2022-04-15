package com.x.pattern.facade;

/**
 * @author Yiqi Li
 */
public class Light implements ElectricalApplication{
    @Override
    public void on() {
        System.out.println("打开电灯................");
    }

    @Override
    public void off() {
        System.out.println("关闭电灯................");
    }
}
