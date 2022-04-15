package com.x.pattern.proxy.jdk_proxy;

/**
 * @author Gavin
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train station sell tickets");
    }
}
