package com.x.principles.demo01;

public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void showSkin() {
        skin.showSkin();
    }
}
