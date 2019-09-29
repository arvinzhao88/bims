package com.cummins.erp.model;

import lombok.Data;

/**
 * @program: bims
 * @description: SqI实体类
 * @author: wdxu
 * @create: 2019-06-26 14:13
 */
@Data
public class SqI {
    //供应商名称
    private String vendorName;
    //供应商代码
    private String vendorCode;
    //vendorSiteCode
    private String vendorSiteCode;
    //人员编号
    private String sqieNumber;
    //人员姓名
    private String sqieName;
}