package com.tuling.testPropertyEditor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: yanshi
 * @date: 2019-08-16 10:51  
 * @since V1.0
 **/
@Component
public class TestA {
    @Value("2019-01-01")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
