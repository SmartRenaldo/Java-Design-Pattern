package com.x.pattern.visitor;

public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("eat well! wangwang!");
    }
}
