package com.x.pattern.builder.demo1;

/**
 * @author Yiqi Li
 */
public class Director {
    private Builder builder;

    public Director() {
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();

        return builder.createBike();
    }
}
