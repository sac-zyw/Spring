package com.sac.demo4;

import com.sac.demo2.UserService;
import com.sac.demo2.UserServiceImpl;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，此时不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
proxy.delete();

    }
}
