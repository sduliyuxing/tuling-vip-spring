package com.tuling.annotationListener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: yanshi
 * @date: 2019-08-16 22:27  
 * @since V1.0
 **/
@Component
public class MyListener {

    @Async
    @EventListener(condition = "!#isAsync")
    public void listener(boolean isAsync){
        System.out.println("Async listener:"+isAsync);
        System.out.println("I will sleep 2s,please wait!");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm awake!");
    }

    @EventListener(condition = "#isAsync")
    public void listener1(boolean isAsync){
        System.out.println("listener:"+isAsync);
        System.out.println("I will sleep 2s,please wait!");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm awake!");
    }
}
