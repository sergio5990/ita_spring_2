package com.sergio5990.ita.spring2.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonInitDestroy2 implements DisposableBean, InitializingBean {
    private final String name;

    public PersonInitDestroy2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void perform() {
        System.out.println("Hello:" + name);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("я  создался");
    }

    @Override
    public void destroy() {
        System.out.println("я  умер");
    }
}
