package com.x.pattern.visitor;

/**
 * concrete person
 */
public class OtherPerson implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("other person feed cat...");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("other person feed dog...");
    }
}
