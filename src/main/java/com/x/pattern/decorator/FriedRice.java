package com.x.pattern.decorator;

/**
 * @author Yiqi Li
 * 炒饭(具体构件角色)
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(20, "炒饭");
    }

    @Override
    public double cost() {
        return this.getPrice();
    }
}
