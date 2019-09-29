package com.cummins.erp.controller;

import com.cummins.erp.model.Engine;
import com.cummins.erp.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: esn相关
 * @author: wdxu
 * @create: 2019-06-21 15:07
 */
@Controller
@RequestMapping("Esn")
public class EngineController {
    @Autowired
    EngineService engineService;

    /**
     * @Author : wdxu
     * @Date :15:17 2019/6/21
     * @Description:模糊查询esn ;返回list<String>
     */
    @RequestMapping("fuzzyQueryEsn/{esn}")
    @ResponseBody
    public List<String> fuzzyQueryEsn(@PathVariable("esn") String esn) {
        List<String> list = engineService.fuzzyQueryEsn(esn);
        return engineService.fuzzyQueryEsn(esn);
    }

    /**
     * @Author : wdxu
     * @Date :16:36 2019/6/21
     * @Description: 通过esn→so;项目号;生产日期
     */
    @RequestMapping("queryItemNumberByEsn/{esn}")
    @ResponseBody
    public Engine queryByEsn(@PathVariable("esn") String esn) {
        return engineService.queryItemNumberByEsn(esn);
    }
}