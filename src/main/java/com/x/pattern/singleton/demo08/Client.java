package com.x.pattern.singleton.demo08;

import com.x.pattern.singleton.demo07.Singleton;

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
