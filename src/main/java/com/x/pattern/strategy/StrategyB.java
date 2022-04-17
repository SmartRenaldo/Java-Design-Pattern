package com.x.pattern.strategy;

/**
 * @author Yiqi Li
 * conctere strategy
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("25% off once purchase up to 200 AUD");
    }
}
