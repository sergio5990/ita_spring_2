package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Person;
import com.sergio5990.ita.spring2.model.PersonInitDestroy;
import org.springframework.context.annotation.Bean;

public class InitDestroyMethod {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    PersonInitDestroy person(){
        final PersonInitDestroy instance = new PersonInitDestroy("Sergey");
        return instance;
    }
}
