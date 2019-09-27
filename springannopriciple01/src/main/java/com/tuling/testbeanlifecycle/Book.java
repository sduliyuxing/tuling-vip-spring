package com.tuling.testbeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by smlz on 2019/5/24.
 */
@Component
public class Book implements InitializingBean,DisposableBean {

    public Book() {
        System.out.println("book 的构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("book 的javax:PostConstruct标志的方法");
    }

    @PreDestroy
    public void preDestory() {
        System.out.println("book 的javax:PreDestory标注的方法");
    }

    public void myInit() {
        System.out.println("book的初始化方法......@initMethod");
    }

    public void myDestroy() {
        System.out.println("book的销毁方法.....@destroyMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("book的销毁方法....DisposableBean:destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("book afterPropertiesSet 方法.....InitializingBean:afterPropertiesSet");
    }

    @Transactional(rollbackFor = Exception.class)
    public void doManage(){

    }
}
