package org.youdian.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.youdian.springmvc.dao.UserDao;
import org.youdian.springmvc.model.User;
import org.youdian.springmvc.service.UserService;

/**
 * Created by Admin on 2015/4/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
