package com.sac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.sac.reflect.User");

        //获得类的名字
        System.out.println(c1.getName());//获得全限定类名
        System.out.println(c1.getSimpleName());//获得类名

        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性
        Field[] declaredFields = c1.getDeclaredFields();//可以找到所有的属性
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //获得指定属性的值
        //Field name = c1.getField("name");只能获取public属性
        Field name = c1.getDeclaredField("name");//可以找到所有的属性

        //获得类的方法
        System.out.println("============");
        Method[] methods = c1.getMethods();//获得本类及其父类的所有public方法
        for (Method method : methods) {
            System.out.println("正常的："+method);
        }
        methods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method method : methods) {
            System.out.println(method);
        }
        //获得指定方法
        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        //获得指定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("正常的："+constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("本类的："+declaredConstructor);
        }
        //获取指定的构造器
        Constructor user = c1.getDeclaredConstructor();
        System.out.println("无参构造"+user);
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("有参构造"+declaredConstructor);
    }
}
