package com.tuling.annotationListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/5/27.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        MyPublisher myPublisher= (MyPublisher) ctx.getBean("myPublisher");
        myPublisher.publisher();
        System.out.println("++++++++++++++++++++++++++++");
        myPublisher.asyncPublisher();
        System.out.println("++++++++++++++++++++++++++++");

        System.out.println("ctx publish event begin");
        ctx.publishEvent(false);
        System.out.println("ctx publish event end");
    }
}
