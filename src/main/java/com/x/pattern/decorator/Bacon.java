package com.x.pattern.decorator;

/**
 * @author Yiqi Li
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 6, "培根");
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
