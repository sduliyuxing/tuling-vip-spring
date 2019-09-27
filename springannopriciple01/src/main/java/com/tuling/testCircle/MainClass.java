package com.tuling.testCircle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by smlz on 2019/6/5.
 */
public class MainClass {

    public static void main(String[] args) {
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("circle_Constructor.xml"));
//        xmlBeanFactory.getBean("testA");
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("circle_set.xml"));
//        xmlBeanFactory.getBean("testA");
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("circle_scope.xml"));
//        xmlBeanFactory.getBean("testA");
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("circle_set.xml");
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(MainConfig.class);
    }

}
