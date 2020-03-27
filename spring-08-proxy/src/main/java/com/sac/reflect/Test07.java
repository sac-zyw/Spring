package com.sac.reflect;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类的加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //获取当前类的类加载器
        Class c1 = Class.forName("com.sac.reflect.Test07");
        ClassLoader classLoader = c1.getClassLoader();
        System.out.println(classLoader);
        //测试jdk内部的加载器
        Class c2=Class.forName("java.lang.Object");
        ClassLoader loader = c2.getClassLoader();
        System.out.println(loader);
        //如何获取系统类加载器的加载路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        D:\WorkSpace\Spring\spring-08-proxy\target\classes;
        D:\maven\repository\org\springframework\spring-webmvc\5.2.4.RELEASE\spring-webmvc-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-aop\5.2.4.RELEASE\spring-aop-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-beans\5.2.4.RELEASE\spring-beans-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-context\5.2.4.RELEASE\spring-context-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-core\5.2.4.RELEASE\spring-core-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-jcl\5.2.4.RELEASE\spring-jcl-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-expression\5.2.4.RELEASE\spring-expression-5.2.4.RELEASE.jar;
        D:\maven\repository\org\springframework\spring-web\5.2.4.RELEASE\spring-web-5.2.4.RELEASE.jar

         */

        //双亲委派机制
        //java.lang.String
    }
}
