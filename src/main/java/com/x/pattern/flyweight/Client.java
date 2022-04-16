package com.x.pattern.flyweight;

/**
 * @author Yiqi Li
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        //client needs news form website
        WebSite webSite1 = factory.getWebsiteCategory("news");
        webSite1.use(new User("tom"));

        //client blog news form website
        WebSite webSite2 = factory.getWebsiteCategory("blog");
        webSite2.use(new User("jerry"));

        //client blog news form website
        WebSite webSite3 = factory.getWebsiteCategory("blog");
        webSite3.use(new User("master"));

        //client blog news form website
        WebSite webSite4 = factory.getWebsiteCategory("blog");
        webSite4.use(new User("monster"));

        System.out.println("factory.getWebsiteCount() = " + factory.getWebsiteCount());
    }
}
