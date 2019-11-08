package com.sergio5990.ita.spring2.config;

import com.sergio5990.ita.spring2.model.Props;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class PropsConfig {

    @Bean
    public Props props() {
        final Properties itemProps = new Properties();
        itemProps.setProperty("7", "8");

        final HashMap<String, String> itemMap = new HashMap<String, String>();
        itemMap.put("3", "5");

        final Collection<String> itemCollection = Arrays.asList("1", "2");
        final List<String> itemList = Arrays.asList("2", "3");
        final Set<String> singleton = Collections.singleton("5");

        return new Props(
                itemCollection,
                itemList,
                singleton,
                itemMap,
                itemProps);
    }
}
