package com.x.pattern.builder.demo1;

/**
 * @author Yiqi Li
 */
public class QingjuBuilder extends Builder {
    @Override
    public void buildFrame() {
        System.out.println("铝合金车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("橡胶座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
