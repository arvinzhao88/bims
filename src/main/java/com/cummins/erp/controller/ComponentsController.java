package com.cummins.erp.controller;

import com.cummins.erp.model.Components;
import com.cummins.erp.service.ComponentsService;
import com.cummins.erp.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: bims
 * @description: Components--零件相关
 * @author: wdxu
 * @create: 2019-06-13 16:30
 */
@Controller
@RequestMapping("Components")
public class ComponentsController {
    @Autowired
    ComponentsService componentsService;
    @Autowired
    SupplierService supplierService;

    /**
     * @Author : wdxu
     * @Date :11:28 2019/6/21
     * @Description:零件号模糊查询；返回零件号集合
     */
    @RequestMapping("fuzzyQueryComponents/{partNumber}")
    @ResponseBody
    public List<String> fuzzyQueryComponents(@PathVariable("partNumber") String partNumber) {
        return componentsService.fuzzyQueryComponents(partNumber);
    }

    /**
     * @Author : wdxu
     * @Date :11:47 2019/6/21
     * @Description: 通过零件号number; 返回零件名称；
     */
    @RequestMapping("getPartNameByPartNumber/{partNumber}")
    @ResponseBody
    public Components getPartNameByPartNumber(@PathVariable("partNumber") String partNumber) {
        return componentsService.getPartNameByPartNumber(partNumber);
    }

    /**
     * @Author : wdxu
     * @Date :17:24 2019/6/21
     * @Description: 通过零件号 --查询供应商代码
     */
    @RequestMapping("queryVendorCodeByPartNumber/{partNumber}")
    @ResponseBody
    public  List<String> queryVendorCodeByPartNumber(@PathVariable("partNumber") String partNumber) {

        return supplierService.queryVendorCodeByPartNumber(partNumber);
    }
}