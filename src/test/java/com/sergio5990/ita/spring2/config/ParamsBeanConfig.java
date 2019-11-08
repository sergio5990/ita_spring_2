package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.PersonParams;
import com.sergio5990.ita.spring2.model.PersonParamsBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParamsBeanConfig {

    @Bean
    public PersonParams person() {
        return new PersonParams(1L, "Sergey");
    }

    @Bean
    public PersonParamsBean person2(PersonParams person) {
        return new PersonParamsBean(person);
    }
}
