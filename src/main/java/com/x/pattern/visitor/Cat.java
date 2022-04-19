package com.x.pattern.visitor;

/**
 * concrete element class
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("eat well! miao!");
    }
}
