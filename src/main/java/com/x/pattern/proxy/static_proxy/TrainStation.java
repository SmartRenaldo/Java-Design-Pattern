package com.x.pattern.proxy.static_proxy;

/**
 * @author Gavin
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train station sell tickets");
    }
}
