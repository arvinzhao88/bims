package com.cummins.bims.controller;

import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.service.DealLogService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("dealLog")
@Controller
public class DealLogController {
    @Autowired
    private DealLogService dealLogService;

    @RequestMapping("getLog")
    @ResponseBody
    public JsonResult apuAdd(DealLog dealLog){
        List<DealLog> logList = dealLogService.getLog(dealLog);
        return JsonResult.success(logList);
    }
}
