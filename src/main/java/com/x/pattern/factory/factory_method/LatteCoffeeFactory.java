package com.x.pattern.factory.factory_method;

/**
 * @author Gavin
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
