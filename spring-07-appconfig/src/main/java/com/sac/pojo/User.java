package com.sac.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("天山童姥")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
