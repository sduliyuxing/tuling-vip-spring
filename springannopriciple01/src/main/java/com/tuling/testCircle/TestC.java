package com.tuling.testCircle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: yanshi
 * @date: 2019-08-14 23:12  
 * @since V1.0
 **/
@Component
public class TestC {
    @Autowired
    private TestA testA;

    public TestC(){
        System.out.println("C");
    }
}
