package com.cummins.bims.controller;

import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.ToolLog;
import com.cummins.bims.service.DealLogService;
import com.cummins.sevenstepscar.service.ToolLogService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("toolLog")
@Controller
public class ToollLogController {
    @Autowired
    private ToolLogService toolLogService;

    @RequestMapping("getLog")
    @ResponseBody
    public JsonResult getLog(ToolLog toolLog){
        List<ToolLog> logList = toolLogService.getLog(toolLog);
        return JsonResult.success(logList);
    }
}
