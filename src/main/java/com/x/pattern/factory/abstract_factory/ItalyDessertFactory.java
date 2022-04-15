package com.x.pattern.factory.abstract_factory;

/**
 * @author Gavin
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee makeCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert makeDessert() {
        return new Trimisu();
    }
}
