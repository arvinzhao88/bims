/*
package com.cummins.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


*/
/**
 * /**
 *
 * @program: bims
 * @description: 自定义格式转换器
 * @author: wdxu
 * @create: 2019-06-28 10:29
 *//*



@Component
public class MyDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
        try {
            return format.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

*/
