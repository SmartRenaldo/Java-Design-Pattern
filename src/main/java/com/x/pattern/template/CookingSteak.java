package com.x.pattern.template;

/**
 * @author Yiqi Li
 */
public class CookingSteak extends AbstractCooking {

    @Override
    protected void addIngredient() {
        System.out.println("add steak");
    }

    @Override
    protected void addCondiment() {
        System.out.println("add salt and black pepper");
    }
}
