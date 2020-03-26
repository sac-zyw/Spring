package com.sac.service;

import com.sac.dao.UserDao;
import com.sac.dao.UserDaoImpl;
import com.sac.dao.UserDaoMysqlImpl;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
