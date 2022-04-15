package com.x.pattern.proxy.cglib_proxy;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
