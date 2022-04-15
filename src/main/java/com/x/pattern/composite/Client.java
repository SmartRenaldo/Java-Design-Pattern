package com.x.pattern.composite;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("University of Adelaide", "G8");

        OrganizationComponent businessSchool = new College("business", "business");
        OrganizationComponent lawSchool = new College("law", "law");

        businessSchool.add(new Department("acc","acc"));
        businessSchool.add(new Department("finance","finance"));

        lawSchool.add(new Department("law", "law"));

        university.add(businessSchool);
        university.add(lawSchool);

        university.print();
    }
}
