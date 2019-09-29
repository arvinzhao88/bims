package com.cummins.erp.service.impl;

import com.cummins.erp.dao.ComponentsMapper;
import com.cummins.erp.model.Components;
import com.cummins.erp.service.ComponentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**

/**
 *@program: bims
 *@description: 零件业务层
 *@author: wdxu
 *@create: 2019-06-14 11:42
 */
@Service
public class ComponentsServiceimpl implements ComponentsService {
    @Autowired
    ComponentsMapper componentsMapper;
    /**
    * @Author : wdxu
    * @Date :13:11 2019/6/14
    * @Description:测试
    */
    @Override
    public List<Components> getComponents(){
        return componentsMapper.findComponents();
    }
    /**
     * @Author : wdxu
     * @Date :11:23 2019/6/21
     * @Description:零件号模糊查询；返回零件号集合
     */
    @Override
    public List<String> fuzzyQueryComponents(String partNumber){
        return componentsMapper.fuzzyQueryComponents(partNumber);
    }

    /**
    * @Author : wdxu
    * @Date :13:26 2019/6/21
    * @Description:通过零件号number 带出零件名称；
    */
    @Override
    public Components getPartNameByPartNumber(String partNumber){
        return componentsMapper.getPartNameByPartNumber(partNumber);
    }
}