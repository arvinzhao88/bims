package com.cummins.erp.service;

import com.cummins.erp.model.Supplier;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :14:20 2019/6/21
 * @Description:供应商相关接口
 */
public interface SupplierService {
    /**
     * @Author : wdxu
     * @Date :14:23 2019/6/21
     * @Description: 通过供应商代码查询供应商名称
     */
    Supplier getSupplierNameBycode(String supplierCode);

    /**
     * @Author : wdxu
     * @Date :17:27 2019/6/21
     * @Description: 通过零件号查询供应商代码
     */
    List<String> queryVendorCodeByPartNumber(String partName);

    /**
     * @Author : wdxu
     * @Date :11:13 2019/6/26
     * @Description: 通过零件号/供应商代码 带出 ppap
     */
    String partNumberSupplierCodeBringsOutPpap(String partNumber, String supplierCode);

    /**
     * @Author : wdxu
     * @Date :11:13 2019/6/26
     * @Description: 零件编号模糊查询
     */
    List<String> partNumberlike(String partNo);

    /**
     * 通过零件号查询供应商列表
     * @param partNo
     * @return
     */
    List<Supplier> getSupplierByPartNo(String partNo);
}
