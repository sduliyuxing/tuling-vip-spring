package com.tuling.testfactorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/5/20.
 */
@Configuration
public class MainConfig {

    @Bean
    public CarFactoryBean carFactoryBean() {
        return new CarFactoryBean();
    }
}
