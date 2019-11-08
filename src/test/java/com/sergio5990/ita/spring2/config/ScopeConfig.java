package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    @Bean
    @Scope("prototype")
    Person person() {
        final Person instance = Person.getInstance();
        instance.setName("Sergey");
        return instance;
    }
}
