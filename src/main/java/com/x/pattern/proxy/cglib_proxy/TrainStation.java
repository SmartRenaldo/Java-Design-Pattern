package com.x.pattern.proxy.cglib_proxy;

import com.x.pattern.proxy.jdk_proxy.SellTickets;

/**
 * @author Gavin
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train station sell tickets");
    }
}
