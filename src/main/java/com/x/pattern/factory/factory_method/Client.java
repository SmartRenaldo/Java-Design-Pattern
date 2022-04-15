package com.x.pattern.factory.factory_method;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        store.setFactory(americanCoffeeFactory);
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
