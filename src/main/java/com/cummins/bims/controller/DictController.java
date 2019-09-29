package com.cummins.bims.controller;

import com.cummins.bims.dto.Dict;
import com.cummins.bims.service.DictService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("dict")
@Controller
public class DictController {
    @Autowired
    private DictService dictService;

    @RequestMapping("getSelectList")
    @ResponseBody
    private JsonResult getDictByType(Dict dict){
        List<Dict> dictList = dictService.getDictByType(dict);
        if (dictList.size()>0){
            return JsonResult.success(dictList);
        }
        return JsonResult.success(dictList);
    }

    /**
     * 获取供应商名称
     * @Author qx
     * @param pid
     * @param tips
     * @return
     */
    @RequestMapping(value = "/getSupplierNameByTips", method = RequestMethod.GET)
    @ResponseBody
    public Dict getSupplierNameByTips(Integer pid, String tips) {
        return dictService.getSupplierNameByTips(pid, tips);
    }
}
