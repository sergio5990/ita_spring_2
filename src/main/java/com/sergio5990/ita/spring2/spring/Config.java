package com.sergio5990.ita.spring2.spring;

import com.sergio5990.ita.spring2.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();

        final DefaultUserService bean = context.getBean(DefaultUserService.class);
        bean.save(new User());
    }

    @Bean
    public DefaultUserService getDefaultUserService(UserDao userDao) {
        return new DefaultUserService(userDao);
    }

    @Bean
    public UserDao getUserDao() {
        return new DefaultUserDao();
    }
}
