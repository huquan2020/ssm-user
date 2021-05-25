package com.itheima.ssm.service;

import com.itheima.ssm.bean.User;

public interface UserService {
    User findUser(User user);

    int save(User user);
}
