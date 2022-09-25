package com.sac.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
@Component
public class People {
    //如果显示定义了Autowired的required属性的为false，说明这个对象可以为空，否则不允许为空
    @Autowired(required = false)
//    @Qualifier("cat")
    private Cat cat;
    @Autowired(required = false)
//    @Qualifier(value = "dog")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" + "cat=" + cat + ", dog=" + dog + ", name='" + name + '\'' + '}';
    }
}
