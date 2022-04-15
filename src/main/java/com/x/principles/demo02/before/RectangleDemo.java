package com.x.principles.demo02.before;

import org.junit.jupiter.api.Test;

/**
 * 里氏代换原则(LSP)是面向对象设计的基本原则之一。
 * 里氏代换原则：任何基类可以出现的地方，子类一定可以出现。通俗理解：子类可以扩展父类的功能，但不能改变父类原有的功能。
 * 换句话说，子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
 * 如果通过重写父类的方法来完成新的功能，这样写起来虽然简单，但是整个继承体系的可复用性会比较差，
 * 特别是运用多态比较频繁时，程序运行出错的概率会非常大。
 * 下面看一个里氏替换原则中经典的一个例子
 * 【例】正方形不是长方形。
 * 在数学领域里，正方形毫无疑问是长方形，它是一个长宽相等的长方形。所以，我们开发的一个与几何图形相关的软件系统，
 * 就可以顺理成章的让正方形继承自长方形。
 *
 * 我们运行一下这段代码就会发现，假如我们把一个普通长方形作为参数传入resize方法，就会看到长方形宽度逐渐增长的效果，
 * 当宽度大于长度,代码就会停止，这种行为的结果符合我们的预期；
 * 假如我们再把一个正方形作为参数传入resize方法后，就会看到正方形的宽度和长度都在不断增长，代码会一直运行下去，直至系统产生溢出错误。
 * 所以，普通的长方形是适合这段代码的，正方形不适合。
 * 我们得出结论：在resize方法中，Rectangle类型的参数是不能被Square类型的参数所代替，如果进行了替换就得不到预期结果。
 * 因此，Square类和Rectangle类之间的继承关系违反了里氏代换原则，它们之间的继承关系不成立，正方形不是长方形。
 *
 * 如何改进呢？此时我们需要重新设计他们之间的关系。
 * 抽象出来一个四边形接口(Quadrilateral)，让Rectangle类和Square类实现Quadrilateral接口
 */
public class RectangleDemo {
    @Test
    public void testLSP() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.5);
        rectangle.setWidth(20);

        resize(rectangle);
        showLengthAndWidth(rectangle);

        Square square = new Square();
        square.setLength(15);

        System.out.println("=============");

        resize(square);
        showLengthAndWidth(square);
    }

    // 如果长小于宽，则扩长
    public static void resize(Rectangle rectangle) {
        while (rectangle.getLength() <= rectangle.getWidth()) {
            rectangle.setLength(rectangle.getLength() + 1);
        }
    }

    // show length and width
    public static void showLengthAndWidth(Rectangle rectangle) {
        System.out.println("rectangle.getLength() = " + rectangle.getLength());
        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
    }
}
