package com.x.principles.demo02.after;

import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void testLSP() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.5);
        rectangle.setWidth(20);

        resize(rectangle);
        showLengthAndWidth(rectangle);

        System.out.println("=================");

        Square square = new Square();
        square.setSide(10);

        showLengthAndWidth(square);
    }

    // 如果长小于宽，则扩长
    public static void resize(Rectangle rectangle) {
        while (rectangle.getLength() <= rectangle.getWidth()) {
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    // show length and width
    public static void showLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("quadrilateral.getLength() = " + quadrilateral.getLength());
        System.out.println("quadrilateral.getWidth() = " + quadrilateral.getWidth());
    }
}
