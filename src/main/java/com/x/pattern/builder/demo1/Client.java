package com.x.pattern.builder.demo1;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobaiBuilder());
        director.construct();
    }
}
