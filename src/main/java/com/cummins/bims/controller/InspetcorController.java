package com.cummins.bims.controller;

import com.cummins.bims.dto.Inspector;
import com.cummins.bims.service.InspetcorService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("inspector")
public class InspetcorController {
    @Autowired
    private InspetcorService inspetcorService;

    @RequestMapping("getInspectors")
    @ResponseBody
    private JsonResult getInspectors(Inspector inspector){
        List<Inspector> inspectorList = inspetcorService.getInspectors(inspector);
        if (inspectorList.size()>0){
            return JsonResult.success(inspectorList);
        }
        return JsonResult.success(inspectorList);
    }
}
