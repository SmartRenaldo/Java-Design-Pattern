package com.x.pattern.factory.config_factory;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.makeCoffee("american");
        System.out.println(american.getName());

        System.out.println("=================");

        Coffee latte = CoffeeFactory.makeCoffee("latte");
        System.out.println(latte.getName());
    }
}
