package com.x.principles.demo05;

public class Client {
    public static void main(String[] args) {
        SuperStar ladyGaga = new SuperStar("Lady Gaga");
        Company legendary = new Company("Legendary");
        Fans liSi = new Fans("Li Si");
        Agent agent = new Agent(ladyGaga, legendary, liSi);

        agent.meeting();
        agent.negotiating();
    }
}
