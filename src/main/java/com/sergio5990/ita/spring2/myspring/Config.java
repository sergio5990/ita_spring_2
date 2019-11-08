package com.sergio5990.ita.spring2.myspring;

import com.sergio5990.ita.spring2.User;

public class Config {

    public static void main(String[] args) {
        final DefaultUserService defaultUserService = getDefaultUserService();
        defaultUserService.save(new User());
    }

    private static DefaultUserService getDefaultUserService() {
        return new DefaultUserService(getUserDao());
    }

    private static UserDao getUserDao() {
        return new DefaultUserDao();
    }
}
