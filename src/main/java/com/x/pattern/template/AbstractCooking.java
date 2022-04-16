package com.x.pattern.template;

/**
 * cooking template
 * @author Yiqi Li
 */
public abstract class AbstractCooking {
    /**
     * define template method
     */
    protected final void cookProcess(){
        addOil();
        heatOil();
        addIngredient();
        addCondiment();
        fry();
    }

    protected void addOil() {
        System.out.println("add oil");
    }

    protected void heatOil() {
        System.out.println("heat oil");
    }

    /**
     * this method is different
     */
    protected abstract void addIngredient();

    /**
     * 加调料
     * this method is different
     */
    protected abstract void addCondiment();

    protected void fry(){
        System.out.println("fry");
    }
}
