package com.tuling.testbeanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * 后置处理器  在bean调用初始化方法前后进行调用
 * Created by smlz on 2019/5/24.
 */
@Component
public class TulingBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("book")){
            System.out.println("TulingBeanPostProcessor...BeanPostProcessor:postProcessBeforeInitialization:"+beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("book")){
            System.out.println("TulingBeanPostProcessor...BeanPostProcessor:postProcessAfterInitialization:"+beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals("book")){
            System.out.println("TulingBeanPostProcessor...InstantiationAwareBeanPostProcessor:postProcessBeforeInstantiation:"+beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equals("book")){
            System.out.println("TulingBeanPostProcessor...InstantiationAwareBeanPostProcessor:postProcessAfterInstantiation:"+beanName);
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if(beanName.equals("book")){
            System.out.println("TulingBeanPostProcessor...InstantiationAwareBeanPostProcessor:postProcessPropertyValues:"+beanName);
        }
        return null;
    }
}
