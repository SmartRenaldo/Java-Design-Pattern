package com.x.pattern.factory.factory_method;

/**
 * @author Gavin
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
