package com.x.pattern.builder.demo1;

/**
 * @author Yiqi Li
 */
public class MobaiBuilder extends Builder {
    @Override
    public void buildFrame() {
        System.out.println("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
