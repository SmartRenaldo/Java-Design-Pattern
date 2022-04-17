package com.x.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * food order class
 *
 * @author Yiqi Li
 */
public class Order {
    /**
     * table number
     */
    private int tableNum;

    /**
     * food name and number
     */
    private Map<String, Integer> foodOrder = new HashMap<>();

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public Map<String, Integer> getFoodOrder() {
        return foodOrder;
    }

    public void setFoodOrder(String name, int num) {
        this.foodOrder.put(name, num);
    }
}
