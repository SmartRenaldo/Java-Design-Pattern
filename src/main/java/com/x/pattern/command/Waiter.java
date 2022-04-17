package com.x.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * invoker
 * @author Yiqi Li
 */
public class Waiter {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    /**
     * invoke command
     */
    public void sendOrder(){
        System.out.println("New order!");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
