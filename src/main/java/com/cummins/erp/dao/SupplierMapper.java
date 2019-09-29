package com.cummins.erp.dao;

import com.cummins.erp.model.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author : wdxu
 * @Date :14:25 2019/6/21
 * @Description: 供应商接口
 */

@Repository
public interface SupplierMapper {
    /**
     * @Author : wdxu
     * @Date :14:23 2019/6/21
     * @Description: 通过供应商代码查询供应商名称
     */
    Supplier getSupplierNameBycode(String supplierCode);

    /**
     * @Author : wdxu
     * @Date :17:35 2019/6/21
     * @Description: 通过零件号查询供应商代码
     */
    List<String> queryVendorCodeByPartNumber(String partName);

    /**
     * @Author : wdxu
     * @Date :11:18 2019/6/26
     * @Description: 通过零件号/供应商代码 带出 ppap
     */
    String partNumberSupplierCodeBringsOutPpap(@Param("params") Map<String, Object> map);

    /**
     * @Author : wdxu
     * @Date :11:18 2019/6/26
     * @Description: 模糊查询零件号
     */
    List<String> partNumberlike(@Param("partNo") String partNo);

    /**
     * 根据零件名称查询供应商列表
     * @param partNo
     * @return
     */
    List<Supplier> getSupplierByPartNo(@Param("partNo") String partNo);
}
