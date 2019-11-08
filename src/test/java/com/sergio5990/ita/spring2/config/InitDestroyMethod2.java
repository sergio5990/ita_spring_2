package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.PersonInitDestroy;
import com.sergio5990.ita.spring2.model.PersonInitDestroy2;
import org.springframework.context.annotation.Bean;

public class InitDestroyMethod2 {

    @Bean()
    PersonInitDestroy2 person(){
        final PersonInitDestroy2 instance = new PersonInitDestroy2("Sergey");
        return instance;
    }
}
