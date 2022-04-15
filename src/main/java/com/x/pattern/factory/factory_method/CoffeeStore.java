package com.x.pattern.factory.factory_method;

/**
 * @author Gavin
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee();

        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }
}
