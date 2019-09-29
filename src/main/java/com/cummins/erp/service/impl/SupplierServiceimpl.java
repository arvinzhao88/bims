package com.cummins.erp.service.impl;

import com.cummins.erp.dao.SupplierMapper;
import com.cummins.erp.model.Supplier;
import com.cummins.erp.service.SupplierService;
import com.google.common.base.Suppliers;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * /**
 *
 * @program: bims
 * @description: 供应商业务处理
 * @author: wdxu
 * @create: 2019-06-21 14:21
 */
@Service
public class SupplierServiceimpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;

    /**
     * @Author : wdxu
     * @Date :14:23 2019/6/21
     * @Description: 通过供应商代码查询供应商名称
     */
    @Override
    public Supplier getSupplierNameBycode(String supplierCode) {
        return supplierMapper.getSupplierNameBycode(supplierCode);
    }

    /**
     * @Author : wdxu
     * @Date :17:33 2019/6/21
     * @Description: 通过零件号查询供应商代码
     */
    @Override
    public List<String> queryVendorCodeByPartNumber(String partName) {
        return supplierMapper.queryVendorCodeByPartNumber(partName);
    }

    /**
     * @Author : wdxu
     * @Date :11:14 2019/6/26
     * @Description: 通过零件号/供应商代码 带出 ppap
     */
    @Override
    public String partNumberSupplierCodeBringsOutPpap(String partNumber, String supplierCode) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("partNumber", partNumber);
        map.put("supplierCode", supplierCode);
        return supplierMapper.partNumberSupplierCodeBringsOutPpap(map);
    }

    /**
     * @Author : wdxu
     * @Date :11:14 2019/6/26
     * @Description: 通过零件号模糊查询
     */
    @Override
    public  List<String> partNumberlike(String partNo){
        return supplierMapper.partNumberlike(partNo);
    }

    /**
     * 通过零件号查询供应商列表
     * @param partNo
     * @return
     */
    @Override
    public List<Supplier> getSupplierByPartNo(String partNo) {
        return supplierMapper.getSupplierByPartNo(partNo);
    }
}