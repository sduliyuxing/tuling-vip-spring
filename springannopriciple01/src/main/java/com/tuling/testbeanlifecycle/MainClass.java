package com.tuling.testbeanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/5/24.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Book book = (Book) ctx.getBean("book");
        book.doManage();
        ctx.close();
    }
}
