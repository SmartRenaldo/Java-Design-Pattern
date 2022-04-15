package com.x.pattern.singleton.demo05;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1 == instance2: " + (instance1 == instance2));
    }
}
