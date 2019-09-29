package com.cummins.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**

/**
 *@program: bims
 *@description: Date类型转/年/月/日
 *@author: wdxu
 *@create: 2019-06-18 16:43
 */
public class DateUtil2 {
    public String DateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date);
        String[] str = time.split("-");
        return str[0] + "年" + "/" + str[1] + "月" + "/" + str[2] + "日";
    }
}