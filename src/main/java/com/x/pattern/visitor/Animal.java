package com.x.pattern.visitor;

/**
 * abstract element, need to be visited by visitor
 */
public interface Animal {
    void accept(Person person);
}
