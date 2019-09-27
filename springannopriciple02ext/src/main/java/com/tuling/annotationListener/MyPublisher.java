package com.tuling.annotationListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author: yanshi
 * @date: 2019-08-16 22:21  
 * @since V1.0
 **/
@Component
public class MyPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void publisher(){
        System.out.println("I will publish an event");
        applicationEventPublisher.publishEvent(true);
        System.out.println("I'm end!");
    }
    public void asyncPublisher(){
        System.out.println("I will publish an async event");
        applicationEventPublisher.publishEvent(false);
        System.out.println("I'm end!");
    }
}
