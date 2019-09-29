package com.cummins.erp.service;

import com.cummins.erp.model.Engine;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :15:29 2019/6/21
 * @Description: 发动机相关接口
 */

public interface EngineService {
    /**
     * @Author : wdxu
     * @Date :15:29 2019/6/21
     * @Description:模糊查询 esn
     */
    List<String> fuzzyQueryEsn(String esn);


    /**
     * @Author : wdxu
     * @Date :16:51 2019/6/21
     * @Description:通过esn 查询 so;项目号
     */
    Engine queryItemNumberByEsn(String esn);
}
