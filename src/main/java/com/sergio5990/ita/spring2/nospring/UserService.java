package com.sergio5990.ita.spring2.nospring;

import com.sergio5990.ita.spring2.User;

public class UserService {

    private static class SingletonHolder {
        static final UserService HOLDER_INSTANCE = new UserService();
    }

    public static UserService getInstance() {
        return UserService.SingletonHolder.HOLDER_INSTANCE;
    }

    private UserDao userDao = UserDao.getInstance();

    public Long save(User user) {
        return userDao.save(user);
    }
}
