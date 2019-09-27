package com.tuling.testPropertyEditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: yanshi
 * @date: 2019-08-16 10:20  
 * @since V1.0
 **/
public class DatePropertyEditor extends PropertyEditorSupport {
    private String format = "yyyy-MM-dd";

    public void setForrnat(String format) {
        this.format = format;
    }

    @Override
    public void setAsText(String argO) throws IllegalArgumentException {
        System.out.println("argO:" + argO);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date d = sdf.parse(argO);
            this.setValue(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
