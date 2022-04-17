package com.x.pattern.strategy;

/**
 * context class
 * @author Yiqi Li
 */
public class Seller {
    private Strategy strategy;

    public Seller(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * show promotions 展示促销活动
     */
    public void show(){
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
