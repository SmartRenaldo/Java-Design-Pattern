package com.x.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Gavin
 */
public class CoffeeFactory {
    private static Map<String, Coffee> map = new HashMap();

    static {
        Properties properties = new Properties();
        // 调用properties对象中的load方法进行配置文件的加载
        InputStream ras = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try {
            properties.load(ras);

            // 从properties集合中获取全类名并创建对象
            Set<Object> keySet = properties.keySet();

            for (Object key : keySet) {
                String className = properties.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee makeCoffee(String name) {
        return map.get(name);
    }
}
