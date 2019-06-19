package com.tuling.circulardependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/5/29.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.close();
    }
}
