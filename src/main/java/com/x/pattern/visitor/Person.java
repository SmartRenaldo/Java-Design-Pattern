package com.x.pattern.visitor;

/**
 * visitor interface
 */
public interface Person {
    void feed(Cat cat);
    void feed(Dog dog);
}
