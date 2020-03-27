package com.sac.service;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method      要执行的目标对象方法
     * @param args        参数
     * @param target      目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回值为"+returnValue);
    }
}
