package com.tuling.testvalue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by smlz on 2019/5/24.
 */
@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class MainConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
