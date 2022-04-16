package com.x.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * be used as a pool
 * @author Yiqi Li
 */
public class WebsiteFactory {
    private Map<String, ConcreteWebsite> pool = new HashMap<>();

    /**
     * return a website according to the website type.
     * If it is not created, store it on the pool and return
     */
    public WebSite getWebsiteCategory(String type) {
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreteWebsite(type));
        }

        return (WebSite) pool.get(type);
    }

    /**
     * get total count of websites
     */
    public int getWebsiteCount() {
        return pool.size();
    }
}
