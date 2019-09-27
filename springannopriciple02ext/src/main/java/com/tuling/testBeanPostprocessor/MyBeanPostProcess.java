package com.tuling.testBeanPostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: yanshi
 * @date: 2019-08-19 16:19  
 * @since V1.0
 **/
@Component
public class MyBeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("tulingLog".equals(beanName)){
            TulingLog tulingLog = (TulingLog) bean;
            tulingLog.setFlag(2);
            System.out.println(tulingLog);
        }
        return null;
    }
}
