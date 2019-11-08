package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Spel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoSpel {

    @Bean
    public Spel spealBean(){
        return new Spel("good".equals("good"), Math.PI);
    }
}
