package com.sac.demo1;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
//中介
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fee();
    }


    //**************代理角色附带（增强）的一些功能**************//
    private void seeHouse(){
        System.out.println("带租客看房子");
    }
    private void fee(){
        System.out.println("收取中介费");
    }
}
