package com.x.principles.demo04.after;

public class WanjiaDoor implements AgainstTheft,FirePrevention{
    @Override
    public void againstTheft() {
        System.out.println("Against Theft");
    }

    @Override
    public void firePrevention() {
        System.out.println("Fire Prevention");
    }
}
