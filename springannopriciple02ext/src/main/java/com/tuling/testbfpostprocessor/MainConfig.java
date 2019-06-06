package com.tuling.testbfpostprocessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by smlz on 2019/5/26.
 */
@Configuration
@ComponentScan(basePackages = "com.tuling.testbfpostprocessor")
@Import(value = {TulingDao.class,TulingImportSelector.class})
public class MainConfig {

}
