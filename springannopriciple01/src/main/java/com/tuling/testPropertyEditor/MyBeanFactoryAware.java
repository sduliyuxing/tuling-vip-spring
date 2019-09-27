package com.tuling.testPropertyEditor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: yanshi
 * @date: 2019-08-16 11:08  
 * @since V1.0
 **/
@Component
public class MyBeanFactoryAware implements BeanFactoryAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory bf= (DefaultListableBeanFactory) beanFactory;
        bf.registerCustomEditor(Date.class, DatePropertyEditor.class);
    }
}
