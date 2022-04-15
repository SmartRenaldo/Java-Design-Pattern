package com.x.pattern.factory.abstract_factory;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        DessertFactory dessertFactory = new AmericanDessertFactory();

        Coffee coffee = dessertFactory.makeCoffee();
        System.out.println(coffee.getName());

        Dessert dessert = dessertFactory.makeDessert();
        dessert.show();
    }
}
