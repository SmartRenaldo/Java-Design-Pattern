package com.x.pattern.template;

/**
 * @author Yiqi Li
 */
public class CookingChicken extends AbstractCooking {

    @Override
    protected void addIngredient() {
        System.out.println("add chicken");
    }

    @Override
    protected void addCondiment() {
        System.out.println("add salt and tomato");
    }
}
