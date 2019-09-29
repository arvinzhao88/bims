package com.cummins.erp.controller;

import com.cummins.erp.model.SqI;
import com.cummins.erp.service.SqIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: bims
 * @description: SqI
 * @author: wdxu
 * @create: 2019-06-26 14:50
 */
@Controller
@RequestMapping("SqI")
public class SqIController {
    @Autowired
    SqIService sqIService;

    /**
     * @Author : wdxu
     * @Date :14:52 2019/6/26
     * @Description: 根据供应商代码查询 返回list集合
     */
    @RequestMapping("querySqI/{supplierCode}")
    @ResponseBody
    public List<SqI> querySqI(@PathVariable("supplierCode") String supplierCode) {
        return sqIService.querySqI(supplierCode);
    }


}