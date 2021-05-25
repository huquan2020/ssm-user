package com.itheima.ssm.service.impl;

import com.itheima.ssm.bean.User;
import com.itheima.ssm.dao.UserDao;
import com.itheima.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findUser(User user) {
        return userDao.findUser(user);
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }
}
