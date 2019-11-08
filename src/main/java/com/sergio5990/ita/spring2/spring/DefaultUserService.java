package com.sergio5990.ita.spring2.spring;

import com.sergio5990.ita.spring2.User;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultUserService {

    private final UserDao userDao;

    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Long save(User user) {
        return userDao.save(user);
    }
}
