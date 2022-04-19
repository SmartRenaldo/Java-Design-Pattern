package com.x.pattern.mediator;

/**
 * concrete house owner
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
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
        System.out.println("House owner: " + name);
        System.out.println("\tReceived message: " + message);
    }
}
