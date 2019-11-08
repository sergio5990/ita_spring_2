package com.sergio5990.ita.spring2.nospring_int;

import com.sergio5990.ita.spring2.User;


public class DefaultUserDao implements UserDao {

    private static class SingletonHolder {
        static final DefaultUserDao HOLDER_INSTANCE = new DefaultUserDao();
    }

    public static DefaultUserDao getInstance() {
        return DefaultUserDao.SingletonHolder.HOLDER_INSTANCE;
    }

    @Override
    public Long save(User user) {
        //dataSource.store()
        System.out.println("saved");
        return -1L;
    }
}
