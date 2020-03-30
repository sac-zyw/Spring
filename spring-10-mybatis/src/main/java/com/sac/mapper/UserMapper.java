package com.sac.mapper;

import com.sac.pojo.User;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/27
 */
public interface UserMapper {
    List<User> selectUser();
}
