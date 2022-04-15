package com.x.principles.demo04.before;

public class XingyueshenDoor implements Door{
    @Override
    public void againstTheft() {
        System.out.println("Against Theft");
    }

    @Override
    public void firePrevention() {
        System.out.println("Fire Prevention");
    }

    @Override
    public void waterproof() {
        System.out.println("Waterproof");
    }
}
