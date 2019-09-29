package com.cummins.erp.model;

import lombok.Data;

import java.util.Date;


/**
 *@program: bims
 *@description: 发动机
 *@author: wdxu
 *@create: 2019-06-21 14:58
 */
@Data
public class Engine {
    //esn
    private String esn;
    //so
    private String so;
    //项目号
    private String prjectName;
    //生产日期
    private Date productionDate;
}