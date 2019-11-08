package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Props;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;

@Configuration
public class PropsConfig {

    @Bean
    public Props Props() {
        final Properties itemProps = new Properties();
        itemProps.setProperty("7", "8");

        final HashMap<String, String> itemMap = new HashMap<String, String>();
        itemMap.put("3", "5");
        return new Props(
                Arrays.asList("1", "2"),
                Arrays.asList("2", "3"),
                Collections.singleton("5"),
                itemMap,
                itemProps
        );
    }
}
