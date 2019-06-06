package com.tuling.testcreatebeaninst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by smlz on 2019/6/3.
 */
@Configuration
//@ComponentScan(basePackages = {"com.tuling.testcreatebeaninst"})
@ImportResource(locations = {"classpath:Beans.xml"})
public class MainConfig {

/*    @Bean
    public TulingAspect tulingAspect(@Autowired TulingLog tulingLog) {
        return new TulingAspect(tulingLog);
    }*/

}
