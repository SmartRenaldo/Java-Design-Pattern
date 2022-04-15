package com.x.pattern.decorator;

/**
 * @author Yiqi Li
 */
public abstract class FastFood {
    private double price;
    private String desc;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood() {
    }

    public FastFood(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public abstract double cost();
}
