package com.x.pattern.facade;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationsFacade facade = new SmartApplicationsFacade();
        facade.say("打开家电");
        System.out.println("==================================");
        facade.say("全给我关闭");
    }
}
