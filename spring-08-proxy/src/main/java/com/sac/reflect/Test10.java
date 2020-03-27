package com.sac.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
       // test02();
        test03();
    }

    public static void test01() {
        User user = new User();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通方式：" + (end - start) + "ms");
    }

    public static void test02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class c1 = Class.forName("com.sac.reflect.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(c1, null);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方式：" + (end - start) + "ms");
    }

    public static void test03() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class c1 = Class.forName("com.sac.reflect.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(c1, null);
        }
        long end = System.currentTimeMillis();
        System.out.println("关闭检测的反射方式：" + (end - start) + "ms");
    }
}
