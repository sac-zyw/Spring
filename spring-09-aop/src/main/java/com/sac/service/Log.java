package com.sac.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Log implements MethodBeforeAdvice {
    /**
     *
     * @param method    要执行的目标对象方法
     * @param objects   参数
     * @param o         目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"类"+method.getName()+"被执行了");
    }
}
