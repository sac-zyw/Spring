package com.sac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class c1 = Class.forName("com.sac.reflect.User");

        //构造一个对象
//        User user = (User) c1.newInstance();//本质上时调用了类的无参构造函数
//        System.out.println(user);

        //通过构造函数创建对象
//        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
//        User user2 = (User) declaredConstructor.newInstance("青江", 001, 18);
//        System.out.println(user2);

        //通过反射调用方法
        User user3 = (User) c1.newInstance();
        //通过反射获得方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke 激活
        //（对象，"方法的值"）
        setName.invoke(user3,"土豆");
        System.out.println(user3.getName());

        //通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，需要关闭权限检测
        name.setAccessible(true);
        name.set(user4,"香蕉");
        System.out.println(user4.getName());
    }
}
