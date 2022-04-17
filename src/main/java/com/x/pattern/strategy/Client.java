package com.x.pattern.strategy;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        Seller seller = new Seller(new StrategyA());
        seller.show();
        seller.setStrategy(new StrategyB());
        seller.show();
    }
}
