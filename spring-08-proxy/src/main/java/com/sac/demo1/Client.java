package com.sac.demo1;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
