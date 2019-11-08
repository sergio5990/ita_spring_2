package com.sergio5990.ita.spring2.myspring;

import com.sergio5990.ita.spring2.User;

public class Config {

    public static void main(String[] args) {

        //config
        final UserDao userDao = defaultUserDao();
        final DefaultUserService defaultUserService = defaultUserService(userDao);

        //logic
        defaultUserService.save(new User());
    }

    private static DefaultUserService defaultUserService(UserDao userDao) {
        return new DefaultUserService(userDao);
    }

    private static UserDao defaultUserDao() {
        return new DefaultUserDao();
    }
}
