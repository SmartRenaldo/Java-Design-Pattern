package com.x.pattern.template;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        CookingSteak steak = new CookingSteak();
        CookingChicken chicken = new CookingChicken();
        steak.cookProcess();
        chicken.cookProcess();
    }
}
