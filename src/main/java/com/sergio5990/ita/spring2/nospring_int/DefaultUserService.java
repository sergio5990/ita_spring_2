package com.sergio5990.ita.spring2.nospring_int;

import com.sergio5990.ita.spring2.User;
import com.sergio5990.ita.spring2.nospring.UserService;

public class DefaultUserService {

    private static class SingletonHolder {
        static final DefaultUserService HOLDER_INSTANCE = new DefaultUserService();
    }

    public static DefaultUserService getInstance() {
        return DefaultUserService.SingletonHolder.HOLDER_INSTANCE;
    }

    private UserDao userDao = DefaultUserDao.getInstance();

    public Long save(User user) {
        return userDao.save(user);
    }
}
