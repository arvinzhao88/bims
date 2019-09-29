package com.cummins.erp.service;

import com.cummins.erp.model.Components;

import java.util.List;

/**
 * @创建人 wdxu
 * @创建时间 20190614
 * @描述
 */


public interface ComponentsService {
    /**
     * @Author : wdxu
     * @Date :11:44 2019/6/14
     * @Description:测试
     */
    List<Components> getComponents();

    /**
     * @Author : wdxu
     * @Date :11:22 2019/6/21
     * @Description:零件号模糊查询；返回零件号集合
     */
    List<String> fuzzyQueryComponents(String partNumber);

    /**
     * @Author : wdxu
     * @Date :13:24 2019/6/21
     * @Description:通过零件号number 带出零件名称；
     */
    Components getPartNameByPartNumber(String partNumber);

}
