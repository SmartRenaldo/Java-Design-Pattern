package com.x.pattern.flyweight;

/**
 * @author Yiqi Li
 */
public class ConcreteWebsite extends WebSite {
    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("Publishing form of the website: " + type + ". User: " + user.getName());
    }
}
