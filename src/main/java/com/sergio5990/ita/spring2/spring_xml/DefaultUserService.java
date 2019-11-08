package com.sergio5990.ita.spring2.spring_xml;

import com.sergio5990.ita.spring2.User;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultUserService {

    @Autowired
    private UserDao userDao;

    public DefaultUserService() {
    }

    public Long save(User user) {
        return userDao.save(user);
    }
}
