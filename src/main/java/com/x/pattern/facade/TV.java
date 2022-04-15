package com.x.pattern.facade;

/**
 * @author Yiqi Li
 */
public class TV implements ElectricalApplication {
    @Override
    public void on() {
        System.out.println("打开电视机................");
    }

    @Override
    public void off() {
        System.out.println("关闭电视机................");
    }
}
