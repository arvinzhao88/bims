package com.cummins.erp.controller;

import com.cummins.erp.model.Supplier;
import com.cummins.erp.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: bims
 * @description: 供应商相关
 * @author: wdxu
 * @create: 2019-06-21 14:10
 */
@Controller
@RequestMapping("Supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    /**
     * @Author : wdxu
     * @Date :14:22 2019/6/21
     * @Description: 通过供应商代码查询供应商名称
     */
    @RequestMapping("getSupplierNameBycode/{supplierCode}")
    @ResponseBody
    public Supplier getSupplierNameBycode(@PathVariable("supplierCode") String supplierCode) {
        return supplierService.getSupplierNameBycode(supplierCode);
    }

    /**
     * @Author : wdxu
     * @Date :11:05 2019/6/26
     * @Description: 通过零件号/供应商代码 带出 ppap
     */

    @RequestMapping("partNumberSupplierCodeBringsOutPpap/{partNumber}/{supplierCode}")
    @ResponseBody
    public String partNumberSupplierCodeBringsOutPpap
    (@PathVariable("partNumber") String partNumber,
     @PathVariable("supplierCode") String supplierCode) {
        return supplierService.partNumberSupplierCodeBringsOutPpap(partNumber, supplierCode);
    }

    /**
     * @Author : wdxu
     * @Date :11:05 2019/6/26
     * @Description: 零件编号 模糊查询
     */
    @RequestMapping(value = "partNumberlike", method = RequestMethod.GET)
    @ResponseBody
    public List<String> partNumberlike(String partNo){
        return supplierService.partNumberlike(partNo);
    }

    /**
     * 通过零件号查询供应商列表
     * @param partNo
     * @return
     */
    @RequestMapping(value = "getSupplierByPartNo", method = RequestMethod.GET)
    @ResponseBody
    public List<Supplier> getSupplierByPartNo(String partNo) {
        return supplierService.getSupplierByPartNo(partNo);
    }
}