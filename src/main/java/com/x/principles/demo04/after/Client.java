package com.x.principles.demo04.after;

public class Client {
    public static void main(String[] args) {
        XingyueshenDoor xingyueshenDoor = new XingyueshenDoor();
        xingyueshenDoor.againstTheft();
        xingyueshenDoor.firePrevention();
        xingyueshenDoor.waterproof();

        System.out.println("===========");

        WanjiaDoor wanjiaDoor = new WanjiaDoor();
        wanjiaDoor.againstTheft();
        wanjiaDoor.firePrevention();
    }
}
