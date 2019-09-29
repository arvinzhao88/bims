package com.cummins.bims.controller;

import com.cummins.bims.dto.Car;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.ToolNotification;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.SendEmailService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.Map;

import static com.cummins.util.DateUtil.format;

@Controller
@RequestMapping("sendEmail")
public class SendEmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @Autowired
    private ApuCheckService apuCheckService;
    /**
     * 工具邮件发送
     * @param toolNotification
     * @param request
     * @return
     */
    @RequestMapping("/send")
    @ResponseBody
    public JsonResult sendEmail(ToolNotification toolNotification, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        String mailContent  = "<br>";
//        mailContent  += "Dear  "+ person.getName() +"<br><br>" ;
        mailContent  += "您有一个工具通知！<br>" ;
        mailContent  += "You have a TOOL Notification Form !<br><br>" ;
        mailContent  += "问题编号：" + apuCheckService.apuDetail(toolNotification.getIssueId()).getNumber() +"<br>" ;
        mailContent  += "创建日期：" + format(toolNotification.getCreateTime(), "yyyy-MM-dd") +"<br>" ;
        mailContent  += "发送人：" + person.getName() +"<br>" ;
        mailContent  += "内容：" + toolNotification.getNotificationInfo() +"<br>" ;

        mailContent  += "请及时处理。谢谢" +"<br>" ;
        mailContent  += "Please deal with it in time And update the progress in the BIMS. Thanks" +"<br>" ;
        mailContent  += "有问题请联系BIMS相关负责人" +"<br>" ;
        mailContent  += "If you have any questions, please contact the person in charge of BIMS" +"<br><br><br>" ;
        mailContent  += "这是一个系统邮件，请勿回复" +"<br>" ;
        mailContent  += "This is a system mail please do not reply" +"<br>" ;

        toolNotification.setMailContent(mailContent);
        Integer i = sendEmailService.insertToolNotification(toolNotification,person);
        return JsonResult.success(i);
    }

    /**
     * 问题通知单邮件发送
     * @param notification
     * @param request
     * @return
     */
    @RequestMapping(value = "/sendEQR", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult sendEQR(Notification notification, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        StringBuffer mailContent = new StringBuffer();
        mailContent.append("<br><br>您有一个突发质量问题通知单！<br>You have a EQR Notification Form !<br><br>");
        mailContent.append("<html lang=\"en\"><head>");

        mailContent.append("<style type=\"text/css\">table{border:1px solid #BEBEBE}tr td{border:1px solid #BEBEBE;padding:10px 10px}.x_panel{margin:20px auto}textarea{border-color:#f8f8f8;box-shadow:0 0 10px #8B8989;background:#f3f3f3}button{width:170px;height:40px;border-width:0;border-radius:3px;background:#1e90ff;cursor:pointer;outline:0;font-family:Microsoft YaHei;color:white;font-size:16px;margin-top:10px}button:hover{background:#59f}</style></head><body style=\"#background: #ffffff;\">\n" +
                "<div class=\"col-md-12 col-sm-12 col-xs-12\">\n" +
                "<div class=\"x_panel\" style=\"width:100%;left: 15%; color:#73879C;\"><div class=\"x_content\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"table table-hover table-bordered\">");

       /* mailContent  += "Dear  "+ person.getName() +"<br><br>" ;
        mailContent  += "您有一个突发质量问题通知单！<br>" ;
        mailContent  += "You have a EQR Notification Form !<br><br>" ;
        mailContent  += "Issue Date 问题发生日期：" + format(notification.getIssueDate(), "yyyy-MM-dd") +"<br>" ;
        mailContent  += "Issue Description 问题描述：" + notification.getIssueDesc() +"<br>" ;
        mailContent  += "Issue Area 问题发生区域：" + notification.getIssueArea() +"<br>" ;
        mailContent  += "Station No.工位号：" + notification.getStationNo()+"<br><br>" ;
        mailContent  += "Engine Type 发动机型号：" + notification.getEngineType()+"<br><br>" ;
        mailContent  += "ESN 发动机序列号：" + notification.getEngineSerialNo()+"<br><br>" ;
        mailContent  += "PN 零件号：" + notification.getPartNo()+"<br><br>" ;
        mailContent  += "Part Name 零件名：" + notification.getPartName()+"<br><br>" ;
        mailContent  += "Supplier NO 供应商名称：" + notification.getSupplierName()+"<br><br>" ;
        mailContent  += "ailure Qty 失效数量：" + notification.getAilureQty()+"<br><br>" ;
        mailContent  += "Effect Engine Amout 影响发动机台数：" + notification.getEffectEngineAmout()+"<br><br>" ;
        mailContent  += "Effect Scope 影响范围：" + notification.getEffectScope()+"<br><br>" ;
        mailContent  += "Impact to Delivery 是否影响发交：" + notification.getEffectToDelivery()+"<br><br>" ;
        mailContent  += "Issue Sensor 问题来源：" + notification.getIssueSensor()+"<br><br>" ;
        mailContent  += "Containment action 遏制措施：" + notification.getContainmentAction()+"<br><br>" ;
        mailContent  += "Clean point 断点：" + notification.getCleanPoint()+"<br><br>" ;*/

        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"6\" align=\"center\">EQR Notification Form 突发质量问题通知单</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width='22%'><strong>Issue Date 问题发生日期</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width='28%'>"+ format(notification.getIssueDate(), "yyyy-MM-dd") +"</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width='50%' colspan='4'><strong>Issue Description 问题描述</strong></td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Issue Area 问题发生区域</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">"+ notification.getIssueArea() +"<br></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"4\" rowspan=\"3\">" + notification.getIssueDesc() +"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Station No.工位号</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">"+ notification.getStationNo()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Engine Type 发动机型号</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">"+ notification.getEngineType()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>ESN 发动机序列号</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">/</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"4\"><strong>Containment action 遏制措施</strong></td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>PN 零件号</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getPartNo()+"</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"4\" rowspan=\"3\">"+ notification.getContainmentAction() +"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Part Name 零件名</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getPartName()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Supplier Name 供应商名称</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getSupplierName()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>ailure Qty 失效数量</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + (notification.getAilureQty()==null?"":notification.getAilureQty())+"</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"4\"><strong>Clean point 断点</strong></td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Effect Engine Amout<br>影响发动机台数</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getEffectEngineAmout()+"</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" colspan=\"4\" rowspan=\"4\">" + notification.getCleanPoint()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Effect Scope<br>影响范围</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getEffectScope()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Impact to Delivery<br>是否影响发交</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getEffectToDelivery()+"</td></tr>");
        mailContent.append("<tr style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\"><strong>Issue Sensor<br>问题来源</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\">" + notification.getIssueSensor()+"</td></tr></table></div>");//<td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width="15%"><strong>CAR/SCAR 号码</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width="15%">&nbsp;</td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width="10%"><strong>责任人</strong></td><td style=\"border: 1px solid #BEBEBE;padding: 10px 10px;\" width="10%">&nbsp;</td>

        mailContent.append("请及时处理。谢谢" +"<br>");
        mailContent.append("Please deal with it in time And update the progress in the BIMS. Thanks" +"<br>");
        mailContent.append("有问题请联系BIMS相关负责人" +"<br>");
        mailContent.append("If you have any questions, please contact the person in charge of BIMS" +"<br><br><br>");
        mailContent.append("这是一个系统邮件，请勿回复" +"<br>");
        mailContent.append("This is a system mail please do not reply" +"<br>");
        mailContent.append("</div></div></body></html>");
        notification.setMailContent(mailContent.toString());
        Integer i = sendEmailService.sendEQR(notification,person);
        return JsonResult.success(i);
    }

    /**
     * 工具Car邮件通知
     * @param car
     * @param request
     * @return
     */
    @RequestMapping("/sendCAR")
    @ResponseBody
    public JsonResult sendCAR(Car car, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");

        String mailContent  = "<br>";
//        mailContent  += "Dear  "+ person.getName() +"<br><br>" ;
        mailContent  += "您有一个工具通知！<br>" ;
        mailContent  += "You have a CAR Form !<br><br>" ;
        mailContent  += "创建日期：" + format(new Date(), "yyyy-MM-dd") +"<br>" ;
        mailContent  += "发送人：" + car.getSponsorName() +"<br>" ;
        mailContent  += "编号：" + car.getCarNo() +"<br>" ;
        mailContent  += "请及时处理。谢谢" +"<br>" ;
        mailContent  += "Please deal with it in time And update the progress in the BIMS. Thanks" +"<br>" ;
        mailContent  += "有问题请联系BIMS相关负责人" +"<br>" ;
        mailContent  += "If you have any questions, please contact the person in charge of BIMS" +"<br><br><br>" ;
        mailContent  += "这是一个系统邮件，请勿回复" +"<br>" ;
        mailContent  += "This is a system mail please do not reply" +"<br>" ;

        car.setMailContent(mailContent);
        Integer i = sendEmailService.sendCAR(car,person);
        return JsonResult.success(i);
    }
}
