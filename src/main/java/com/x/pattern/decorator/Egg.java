package com.x.pattern.decorator;

/**
 * @author Yiqi Li
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 2.5, "鸡蛋");
    }

    @Override
    public double cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
