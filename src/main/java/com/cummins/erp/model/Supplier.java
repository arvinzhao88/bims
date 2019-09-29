package com.cummins.erp.model;/**
 * @创建人 wdxu
 * @创建时间 20190621
 * @描述
 */

import lombok.Data;

/**
 *@program: bims
 *@description: 供应商
 *@author: wdxu
 *@create: 2019-06-21 14:12
 */
@Data
public class Supplier {
    //零件号
    private String partNumber;
    //零件号
    private String partName;
    //供应商代码
    private String supplierCode;
    //供应商名称
    private String supplierName;

    //ppap
    private String ppap;
}