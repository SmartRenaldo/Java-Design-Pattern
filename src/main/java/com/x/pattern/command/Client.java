package com.x.pattern.command;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setTableNum(1);
        order1.setFoodOrder("Pasta", 1);
        order1.setFoodOrder("steak", 2);

        Order order2 = new Order();
        order2.setTableNum(2);
        order2.setFoodOrder("Sprite", 2);
        order2.setFoodOrder("Lobster", 3);

        Chef chef = new Chef();
        OrderCommand command1 = new OrderCommand(chef, order1);
        OrderCommand command2 = new OrderCommand(chef, order2);

        Waiter waiter = new Waiter();
        waiter.setCommand(command1);
        waiter.setCommand(command2);

        waiter.sendOrder();
    }
}
