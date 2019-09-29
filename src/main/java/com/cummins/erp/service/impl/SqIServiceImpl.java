package com.cummins.erp.service.impl;

import com.cummins.erp.dao.SqIMapper;
import com.cummins.erp.model.SqI;
import com.cummins.erp.service.SqIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: bims
 * @description: Sql业务
 * @author: wdxu
 * @create: 2019-06-26 15:04
 */
@Service
public class SqIServiceImpl implements SqIService {
    @Autowired
    private SqIMapper sqIMapper;

    /**
     * @Author : wdxu
     * @Date :15:02 2019/6/26
     * @Description: 通过供应商代码查询集合数据
     */
    @Override
    public List<SqI> querySqI(String SupplierCode) {

        return sqIMapper.querySqI(SupplierCode);
    }
}