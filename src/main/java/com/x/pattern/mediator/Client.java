package com.x.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        HousingAgency agency = new HousingAgency();
        Tenant tenant = new Tenant("Elon", agency);
        HouseOwner houseOwner = new HouseOwner("Einstein", agency);

        agency.setTenant(tenant);
        agency.setHouseOwner(houseOwner);

        tenant.contact("Three bedrooms, one living room and one bathroom");
        houseOwner.contact("Meet your requirement!");
    }
}
