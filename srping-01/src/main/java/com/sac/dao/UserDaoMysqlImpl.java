package com.sac.dao;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户的数据");
    }
}
