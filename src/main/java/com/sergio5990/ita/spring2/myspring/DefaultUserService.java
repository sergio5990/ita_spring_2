package com.sergio5990.ita.spring2.myspring;

import com.sergio5990.ita.spring2.User;

public class DefaultUserService {

    private UserDao userDao;

    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Long save(User user) {
        return userDao.save(user);
    }
}
