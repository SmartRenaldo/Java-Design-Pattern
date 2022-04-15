package com.x.pattern.decorator;

/**
 * @author Yiqi Li
 * 装饰者类(抽象装饰者角色)
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, double price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
