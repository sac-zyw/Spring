package com.sac.reflect;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //传统方式
        Person p1 = new Student();
        System.out.println("这个人是："+p1.name);
        //方式一:通过对象获得
        Class c1 = p1.getClass();
        System.out.println(c1.hashCode());
        //方式二:forName获得
        Class c2 = Class.forName("com.sac.reflect.Student");
        System.out.println(c2.hashCode());
        //方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
    }
}

class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name="学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name="老师";
    }
}