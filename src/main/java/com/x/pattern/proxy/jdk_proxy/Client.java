package com.x.pattern.proxy.jdk_proxy;

/**
 * @author Gavin
 */
public class Client {
    public static void main(String[] args) {
        new ProxyFactory().getProxyObject().sell();
    }
}
