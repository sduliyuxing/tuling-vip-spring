package com.tuling.testCircle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: yanshi
 * @date: 2019-08-14 23:12  
 * @since V1.0
 **/
@Component
public class TestD {
    @Autowired
    private TestE testE;

    public TestD() {
    }
}
