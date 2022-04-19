package com.x.pattern.mediator;

/**
 * tenant class
 * 租户类
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * contact with mediator
     *
     * @param message
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    /**
     * get message
     */
    public void getMessage(String message) {
        System.out.println("Tenant: " + name);
        System.out.println("\tReceived message: " + message);
    }
}
