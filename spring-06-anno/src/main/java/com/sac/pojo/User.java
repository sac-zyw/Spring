package com.sac.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
@Component
@Scope("")
public class User {

    public String name ;

    @Value("宽神")
    public void setName(String name) {
        this.name = name;
    }
}
