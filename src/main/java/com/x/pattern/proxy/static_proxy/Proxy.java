package com.x.pattern.proxy.static_proxy;

/**
 * @author Gavin
 */
public class Proxy implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理商收取手续费");
        trainStation.sell();
    }
}
