package com.x.pattern.composite;

/**
 * leaf node
 * @author Yiqi Li
 */
public class Department extends OrganizationComponent{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("--------" + this.getName() + "--------");
    }
}
