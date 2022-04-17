package com.x.pattern.strategy;

/**
 * @author Yiqi Li
 * conctere strategy
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("buy one and get one free");
    }
}
