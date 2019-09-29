package com.cummins.bims.controller;

import com.cummins.bims.dto.Car;
import com.cummins.bims.dto.DealTool;
import com.cummins.bims.service.DealToolService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("dealtool")
public class DealToolController {
    @Autowired
    private DealToolService dealToolService;

    /**
     * 问题对应的处理工具
     * @param dealTool
     * @return
     */
    @RequestMapping("getTools")
    @ResponseBody
    public JsonResult getTools(DealTool dealTool){
        List<DealTool> tools = dealToolService.getTools(dealTool);
        return JsonResult.success(tools);
    }

    /**
     * 添加处理工具
     * @param dealTool
     * @return
     */
    @RequestMapping("addTool")
    @ResponseBody
    public JsonResult addTool(DealTool dealTool, HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        DealTool tool = dealToolService.addTool(dealTool,person);
        return JsonResult.success(tool);
    }

    /**
     * 弃用
     * @param jsonArr
     * @param request
     * @return
     */
    @PostMapping("addToolBatch")
    @ResponseBody
    public JsonResult addToolBatch(String jsonArr, HttpServletRequest request) {
        //获取登录
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        List<DealTool> dealTools = dealToolService.addToolBatch(jsonArr, person);
        return JsonResult.success(dealTools);
    }

    /**
     * 删除处理工具
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "delTool", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult delTool(DealTool dealTool){
        Integer integer = dealToolService.delTool(dealTool);
        return JsonResult.success(integer);
    }

    /**
     * 根据类型获取处理工具
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "getListByToolType", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getListByToolType(DealTool dealTool){
        List<Car> tools = dealToolService.getListByToolType(dealTool);
        return JsonResult.success(tools);
    }


    /**
     * 动态加载工具标签
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "getToolTabs", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getToolTabs(DealTool dealTool){
        List<DealTool> tools = dealToolService.getToolTabs(dealTool);
        return JsonResult.success(tools);
    }
}
