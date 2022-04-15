package com.x.pattern.prototype.demo01;

/**
 * @author Yiqi Li
 */
public class RealizeType implements Cloneable {
    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public RealizeType clone() {
        System.out.println("具体原型复制成功！");

        try {
            return (RealizeType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
