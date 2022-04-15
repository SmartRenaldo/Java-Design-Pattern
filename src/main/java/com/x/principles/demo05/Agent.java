package com.x.principles.demo05;

public class Agent {
    private SuperStar superStar;
    private Company company;
    private Fans fans;

    public Agent(SuperStar superStar, Company company, Fans fans) {
        this.superStar = superStar;
        this.company = company;
        this.fans = fans;
    }

    // 与粉丝见面方法
    public void meeting() {
        System.out.println(superStar.getName() + " is having a meeting with fans " + fans.getName());
    }

    // 与公司洽谈方法
    public void negotiating() {
        System.out.println(superStar.getName() + " is negotiating with company " + company.getName());
    }
}
