package com.cummins.bims.controller;

import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.ToolNotification;
import com.cummins.bims.service.NotificationService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("bims/notification")
public class NotificationCotroller {
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(Notification notification){

        Integer i = notificationService.saveNotification(notification);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }

    @RequestMapping("upd")
    @ResponseBody
    public JsonResult upd(Notification notification){

        Integer i = notificationService.updNotification(notification);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }
}
