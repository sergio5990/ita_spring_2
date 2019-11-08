package com.sergio5990.ita.spring2.spring_xml;

import com.sergio5990.ita.spring2.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class ConfigXml {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.refresh();

        final DefaultUserService bean = context.getBean(DefaultUserService.class);
        bean.save(new User());
    }
}
