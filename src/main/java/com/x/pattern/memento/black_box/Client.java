package com.x.pattern.memento.black_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("---------------Before war--------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.showState();

        //将内部状态备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("---------------After war--------------");
        //severe damage
        gameRole.fight();
        gameRole.showState();

        System.out.println("---------------Restore--------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.showState();
    }
}
