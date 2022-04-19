package com.x.pattern.visitor;

/**
 * concrete person
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("owner feed cat...");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("owner feed dog...");
    }
}
