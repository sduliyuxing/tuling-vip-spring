package com.tuling.testPropertyEditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/6/5.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(MainConfig.class);
        TestA testA = (TestA) ctx1.getBean("testA");
        System.out.println(testA);
    }

}
