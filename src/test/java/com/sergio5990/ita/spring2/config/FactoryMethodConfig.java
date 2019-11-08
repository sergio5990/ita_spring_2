package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Person;
import com.sergio5990.ita.spring2.model.PersonConstr;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryMethodConfig {

    @Bean
    Person person(){
        final Person instance = Person.getInstance();
        instance.setName("Sergey");
        return instance;
    }
}
