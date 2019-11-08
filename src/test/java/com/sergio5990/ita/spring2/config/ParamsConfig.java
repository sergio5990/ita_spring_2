package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.PersonParams;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParamsConfig {

    @Bean
    public PersonParams person(){
        return new PersonParams(1L, "Sergey");
    }

    @Bean
    public PersonParams person2(){
        return new PersonParams(1L, "Sergey");
    }
}
