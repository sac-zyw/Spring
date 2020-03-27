package com.sac.reflect;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
//测试类什么时候会初始化
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
        //  Sun r = new Sun();
        //2.反射也会产生主动引用
        //Class.forName("com.sac.reflect.Sun");
        //3.不会产生类的引用的方法
        //System.out.println(Sun.b);
        //Sun[] array = new Sun[5];
        System.out.println(Sun.M);
    }
}

class Father {
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Sun extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}