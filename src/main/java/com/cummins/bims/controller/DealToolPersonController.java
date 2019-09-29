package com.cummins.bims.controller;

import com.cummins.bims.dto.DealTool;
import com.cummins.bims.dto.DealToolPerson;
import com.cummins.bims.dto.Dict;
import com.cummins.bims.dto.ToolLog;
import com.cummins.bims.enums.DictEnum;
import com.cummins.bims.enums.ToolEnum;
import com.cummins.bims.service.DealToolPersonService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.service.SevenStepsService;
import com.cummins.util.JsonResult;
import com.cummins.util.ToolLogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("back/dealToolPerson")
public class DealToolPersonController {

    @Autowired
    private DealToolPersonService dealToolPersonService;
    @Autowired
    private SevenStepsService sevenStepsService;

    @PostMapping("addToolBatch")
    @ResponseBody
    public JsonResult addToolBatch(String jsonArr, HttpServletRequest request) {
        //获取登录
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        List<DealToolPerson> dealTools = dealToolPersonService.addToolBatch(jsonArr, person);
        return JsonResult.success(dealTools);
    }

    /**
     * 删除处理工具
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "delTool", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult delTool(DealToolPerson dealTool){
        Integer integer = dealToolPersonService.delTool(dealTool);
        /**
         * 删除7步/scar 数据
         */
        sevenStepsService.deleteSevenStepandScar(Integer.parseInt(dealTool.getToolNo()));
        return JsonResult.success(integer);
    }

    /**
     * 动态加载工具标签 根据account查询自己可以看到的工具
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "getToolTabs", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getToolTabs(DealToolPerson dealTool, HttpServletRequest request, Model model){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //
        /*String[] split = person.getBelongRole().split(",");
        List<String> roleList = Arrays.asList(split);
        if(roleList.contains("") && !person.getBelongRole().contains("2")) {

        }*/
        //dealTool.setProcessPersonAccount(person.getAccount());
        List<DealToolPerson> tools = dealToolPersonService.getToolTabs(dealTool,person);

        int step = 1 ;
        //循环
        List<DealToolPerson> newTools = new ArrayList<>();
        for(DealToolPerson toolPerson : tools){
            /** 四种工具 1.car 2.scar 3.7 step 4.notification **/
            //car
            if((int)toolPerson.getToolType() == ToolEnum.CAR.getCode()) {
                toolPerson.setPathUrl("car/toCarByToolPerson");
            //scar
            } else if((int)toolPerson.getToolType() == ToolEnum.SCAR.getCode()) {
                toolPerson.setPathUrl("Scar/jumpSevenStepsUrl");
            //STEP7
            } else if((int)toolPerson.getToolType() == ToolEnum.STEP7.getCode()) {
                toolPerson.setPathUrl("toolsSevenSteps/jumpSevenStepsUrl");
            //Notification
            } else if((int)toolPerson.getToolType() == ToolEnum.Notification.getCode()) {
                toolPerson.setPathUrl("back/toolNotification");
            } else if((int)toolPerson.getToolType() == ToolEnum.PQC.getCode()) {
                toolPerson.setPathUrl("back/toPqc");
            }
            newTools.add(toolPerson);
        }

        return JsonResult.success(newTools);
    }

    @RequestMapping("getTools")
    @ResponseBody
    public JsonResult getTools(DealToolPerson dealTool){
        List<DealToolPerson> tools = dealToolPersonService.getTools(dealTool);
        return JsonResult.success(tools);
    }
}
