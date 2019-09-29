package com.cummins.erp.service.impl;

import com.cummins.erp.dao.EngineMapper;
import com.cummins.erp.model.Engine;
import com.cummins.erp.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: 发动机相关
 * @author: wdxu
 * @create: 2019-06-21 15:44
 */
@Service
public class EngineServiceimpl implements EngineService {

    @Autowired
    EngineMapper engineMapper;
    /**
     * @Author : wdxu
     * @Date :15:46 2019/6/21
     * @Description:模糊查询esn
     */
    @Override
    public List<String> fuzzyQueryEsn(String esn){
        return engineMapper.fuzzyQueryEsn(esn);
    }
    /**
    * @Author : wdxu
    * @Date :16:52 2019/6/21
    * @Description:通过esn查询so;项目号
    */
    @Override
    public Engine queryItemNumberByEsn(String esn){
        return engineMapper.queryItemNumberByEsn(esn);
    }
}