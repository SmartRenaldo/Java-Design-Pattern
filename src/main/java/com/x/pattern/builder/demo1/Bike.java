package com.x.pattern.builder.demo1;

/**
 * @author Yiqi Li
 */
public class Bike {
    // 车架
    private String frame;
    // 车座
    private String seat;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
