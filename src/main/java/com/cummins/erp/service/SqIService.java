package com.cummins.erp.service;

import com.cummins.erp.model.SqI;

import java.util.List;

/**
 * @创建人 wdxu
 * @创建时间 20190606
 * @描述 sqi接口
 */

public interface SqIService {
    /**
     * @Author : wdxu
     * @Date :15:02 2019/6/26
     * @Description: 通过供应商代码查询集合数据
     */
    List<SqI> querySqI(String SupplieCode);


}
