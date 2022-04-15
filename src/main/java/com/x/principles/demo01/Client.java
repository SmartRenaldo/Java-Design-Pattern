package com.x.principles.demo01;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void testSougouInput() {
        SougouInput input = new SougouInput();
        input.setSkin(new DefaultSkin());
        input.showSkin();

        input.setSkin(new DogeSkin());
        input.showSkin();
    }
}
