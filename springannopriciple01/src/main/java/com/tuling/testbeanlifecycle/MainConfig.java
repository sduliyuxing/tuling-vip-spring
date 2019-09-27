package com.tuling.testbeanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/5/24.
 */
@Configuration
@ComponentScan(basePackages = "com.tuling.testbeanlifecycle")
public class MainConfig {

    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    public Book book() {
        return new Book();
    }

    @Bean
    public TulingBeanPostProcessor tulingBeanPostProcessor() {
        return new TulingBeanPostProcessor();
    }
}
