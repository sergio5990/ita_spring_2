package com.sergio5990.ita.spring2.myspring;

import com.sergio5990.ita.spring2.User;


public class DefaultUserDao implements UserDao {

    @Override
    public Long save(User user) {
        //dataSource.store()
        System.out.println("saved");
        return -1L;
    }
}
