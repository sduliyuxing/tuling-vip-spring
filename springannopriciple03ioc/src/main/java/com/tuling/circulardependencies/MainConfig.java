package com.tuling.circulardependencies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by smlz on 2019/5/29.
 */
@Configuration
@ImportResource(locations = "classpath:Beans.xml")
@ComponentScan(basePackages = {"com.tuling.circulardependencies"})
public class MainConfig {

}
