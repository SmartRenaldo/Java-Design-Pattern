package com.x.pattern.factory.abstract_factory;

/**
 * @author Gavin
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee makeCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert makeDessert() {
        return new MatchaMousse();
    }
}
