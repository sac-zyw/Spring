package com.sac.config;

import com.sac.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
@Configuration
@ComponentScan("com.sac.pojo")
@Import(SacConfig.class)
public class MyConfig {
    //注册bean，相当于xml中的bean标签
    //这个方法的名字，相当于bean标签的id属性
    //方法的返回值，相当于bean标签的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
