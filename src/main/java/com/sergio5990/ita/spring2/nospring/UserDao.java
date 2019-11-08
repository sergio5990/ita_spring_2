package com.sergio5990.ita.spring2.nospring;

import com.sergio5990.ita.spring2.User;

public class UserDao {

    private static class SingletonHolder {
        static final UserDao HOLDER_INSTANCE = new UserDao();
    }

    public static UserDao getInstance() {
        return UserDao.SingletonHolder.HOLDER_INSTANCE;
    }

    public Long save(User user) {
        //dataSource.store()
        System.out.println("saved");
        return -1L;
    }
}
