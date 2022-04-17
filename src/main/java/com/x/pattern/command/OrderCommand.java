package com.x.pattern.command;

import java.util.Map;
import java.util.Set;

/**
 * concrete command class
 * @author Yiqi Li
 */
public class OrderCommand implements Command {
    /**
     * receiver is chef
     */
    private Chef receiver;
    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Table: " + order.getTableNum());
        Map<String, Integer> foodOrder = order.getFoodOrder();
        Set<String> foodNames = foodOrder.keySet();

        for (String foodName : foodNames) {
            receiver.cook(foodName, foodOrder.get(foodName));
        }

        System.out.println("Table " + order.getTableNum() + " finished!");
    }
}
