package com.cummins.sevenstepscar.controller;

import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.ToolLog;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.PersonService;
import com.cummins.bims.service.SendEmailService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.sevenstepscar.service.SevenStepsService;
import com.cummins.sevenstepscar.service.ToolLogService;
import com.cummins.sevenstepscar.service.ToolsPersonService;
import com.cummins.util.GenerateOrderNoUtil;
import com.cummins.util.JsonResult;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.cummins.util.DateUtil.format;


/**
 * @program: bims
 * @description: scar
 * @author: wdxu
 * @create: 2019-07-11 17:48
 */
@Controller
@RequestMapping("Scar")
public class ScarController {
    @Autowired
    ApuCheckService apuCheckService;
    @Autowired
    SevenStepsService sevenStepsService;
    @Autowired
    ToolsPersonService toolsPersonService;
    @Autowired
    ToolLogService toolLogService;
    @Autowired
    PermissionService permissionService;

    @Autowired
    private PersonService personService;
    @Autowired
    private SendEmailService sendEmailService;
    /**
     * @Author : wdxu
     * @Date :11:29 2019/7/11
     * @Description: 根据条件跳转不同的controller
     */
    @RequestMapping("jumpSevenStepsUrl/{toolsid}/{questionId}")
    public String jumpSevenStepsUrl(@PathVariable("toolsid") String toolsid,
                                    @PathVariable("questionId") String questionId,
                                    HttpServletRequest request, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(toolsid);
        BimsPerson bimsPerson = (BimsPerson) request.getSession().getAttribute("person");
        /**
         * @Author : wdxu
         * @Date :17:54 2019/7/11
         * @Description: scar 第一步
         */
        if (toolsSevenSteps.getBack3().equals("0") && toolsSevenSteps.getBack5().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/jumpSevenSteps/" + questionId + "/" + toolsid + "/" + toolsSevenSteps.getBack1() + "/" + toolsSevenSteps.getBack2();
            return jumpSevenSteps(questionId, toolsid, toolsSevenSteps.getBack1(), toolsSevenSteps.getBack2(), model);
        }
        /**
         * @Author : wdxu
         * @Date :18:19 2019/7/11
         * @Description: 责任人填写数据
         */
        else if (toolsSevenSteps.getBack3().equals("1") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/jumpSevenStepstwo/" + toolsid + "/" + questionId;
            return jumpSevenStepstwo(toolsid, questionId, model, request);
        }

        /**
         * @Author : wdxu
         * @Date :13:19 2019/7/11
         * @Description: 责任人 步数为 2  当前 登录人是责任人  回显数据
         */
        else if (toolsSevenSteps.getBack3().equals("2") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/showSevenSteptwo/" + toolsid;
            return showSevenSteptwo(toolsid, model);
        }

        /**
         * @Author : wdxu
         * @Date :18:42 2019/7/11
         * @Description: 审核
         */
        else if (toolsSevenSteps.getBack3().equals("2") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/showSevenStepthree/" + toolsid + "/" + questionId;
            return showSevenStepthree(toolsid, questionId, model, request);
        }

        /**
         * @Author : wdxu
         * @Date :13:28 2019/7/11
         * @Description: 责任人再次填写 4-6步
         */
        else if (toolsSevenSteps.getBack3().equals("3") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/jumpSevenStepsfour/" + toolsid + "/" + questionId;
            return jumpSevenStepsfour(toolsid, questionId, model, request);
        }


        /**
         * @Author : wdxu
         * @Date :13:35 2019/7/11
         * @Description: 责任人 查看已经提交的数据
         */
        else if (toolsSevenSteps.getBack3().equals("4") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/showSevenStepfour/" + toolsid;
            return showSevenStepfour(toolsid, model);
        }


        /**
         * @Author : wdxu
         * @Date :13:38 2019/7/11
         * @Description: 审核人  审核 4-6步
         */

        else if (toolsSevenSteps.getBack3().equals("4") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/viewResponsiblePersonData/" + toolsid + "/" + questionId;
            return viewResponsiblePersonData(toolsid, questionId, model, request);
        }


        /**
         * @Author : wdxu
         * @Date :13:46 2019/7/11
         * @Description: 责任人人再次填写数据 7.1
         */
        else if (toolsSevenSteps.getBack3().equals("5") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/fillIn71/" + toolsid + "/" + questionId;
            return fillIn71(toolsid, questionId, model, request);
        }


        /**
         * @Author : wdxu
         * @Date :16:54 2019/7/17
         * @Description: 审核人 审核7.1 步
         */
        else if (toolsSevenSteps.getBack3().equals("6") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/showSevenStepfive/" + toolsid + "/" + questionId;
            return showSevenStepfive(toolsid, questionId, model, request);
        }




        /**
        * @Author : wdxu
        * @Date :17:42 2019/7/17
        * @Description: 审核人 完成填写最后一步
        */
        else if (toolsSevenSteps.getBack3().equals("7") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/Scar/theReviewerFillsInTheLast/" + toolsid + "/" + questionId;
            return theReviewerFillsInTheLast(toolsid, questionId, model, request);
        }


        /**
         *//**
         * @Author : wdxu
         * @Date :13:54 2019/7/11
         * @Description:审核 完成
         *//*
        else if (toolsSevenSteps.getBack3().equals("6") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
            return "redirect:/Scar/jumpSevenStepsixonlyshow/" + toolsid;
        }
        *//**
         * @Author : wdxu
         * @Date :14:20 2019/7/11
         * @Description: 其他
         */
        else {
//            return "redirect:/bims/Scar/jumpAll/" + toolsid;
            return jumpAll(toolsid, model);
        }

    }


    /**
     * @Author : wdxu
     * @Date :18:44 2019/7/8  参数：问题id  工具id  责任人account   审核人accounnt
     * @Description: onestep 根据传递的参数 回显数据
     */
    @RequestMapping("jumpSevenSteps/{id}/{toolsId}/{leadaccount}/{checkaccouunt}")
    public String jumpSevenSteps(String id, String toolsId, String leadaccount, String checkaccouunt, Model model) {
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        model.addAttribute("toolsId", toolsId);
        model.addAttribute("leadaccount", leadaccount);
        model.addAttribute("checkaccouunt", checkaccouunt);
        return "scar/scarpone";
    }

    /**
     * @Author : wdxu
     * @Date :9:29 2019/7/9   参数:scarId
     * @Description: scar step
     */
    @RequestMapping("updatesevenstep")
    @ResponseBody
    public JsonResult updatesevenstep(ToolsSevenSteps toolsSevenSteps,HttpServletRequest request) {
        /**
         *  更新 scar数据
         */
//        toolsSevenSteps.setIssueNumber(GenerateOrderNoUtil.gens(""));
        toolsSevenSteps.setType(2);
        toolsSevenSteps.setBack3("1");//第一步
        //预计完成日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        Date date = new Date(calendar.getTimeInMillis());
        //目标日期
        toolsSevenSteps.setTargetdate1(date);
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系
         */
        toolsPersonService.updateToolsPersonTypeScar(toolsSevenSteps);
        //工具日志

        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交责任人<"+  permissionService.getPersonByAcc(toolsSevenSteps.getBack1()).getName() +">处理");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :18:07 2019/7/11
     * @Description: 更新之后 数据回显
     */

    @RequestMapping("showSevenStep/{id}")
    public String showSevenStep(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scaroneonlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :11:33 2019/7/9  责任人 登录
     * @Description: scar 第二步   参数；工具id /问题Id
     */
    @RequestMapping("jumpSevenStepstwo/{toolsId}/{questionId}")
    public String jumpSevenStepstwo(@PathVariable("toolsId") String toolsId,
                                    @PathVariable("questionId") String questionId,
                                    Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.selectscartwo(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scartwo";
    }

    /**
     * @Author : wdxu
     * @Date :18:22 2019/7/11
     * @Description: scar 第二步 更新数据
     */
    @RequestMapping("updatesevensteptwo")
    @ResponseBody
    public JsonResult updatesevensteptwo(ToolsSevenSteps toolsSevenSteps,HttpServletRequest request) {
        /**
         *  更新 七步数据
         */
        toolsSevenSteps.setBack3("2");//第二步
        //toolsSevenSteps.setBack4(toolsSevenSteps.getBack4());//驳回原因
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系
         */
        toolsPersonService.updateScarTypetwo(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<"+  permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() +">审核");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack2()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }

    /**
     * @Author : wdxu
     * @Date :18:25 2019/7/11
     * @Description: scar 更新数据回显
     */
    @RequestMapping("showSevenSteptwo/{id}")
    public String showSevenSteptwo(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scartwoonlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :17:24 2019/7/9
     * @Description: scar 第三步  审核人审核
     */
    @RequestMapping("showSevenStepthree/{toolsId}/{questionId}")
    public String showSevenStepthree(@PathVariable("toolsId") String toolsId,
                                     @PathVariable("questionId") String questionId,
                                     Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.scarthree(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "scar/scarthree";
    }


    /**
     * @Author : wdxu
     * @Date :17:50 2019/7/9
     * @Description: 质检驳回
     */
    @RequestMapping("updatesevenstepthree")
    @ResponseBody
    public JsonResult updatesevenstepthree(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * 审核人驳回
         */
        //驳回原因
        String reject = request.getParameter("back4");
        toolsSevenSteps.setBack4(reject);
        toolsSevenSteps.setBack3("1");//驳回第一步
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系  审核人→沉默状态0   责任人→1
         */
        toolsPersonService.updatescarthree(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">驳回");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :9:45 2019/7/10
     * @Description: 质检通过
     */
    @RequestMapping("updatesevenstepthreenext")
    @ResponseBody
    public JsonResult updateToolsPersonTypethreenext(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * 审核人通过
         */
        toolsSevenSteps.setBack3("3");//质检通过
        toolsSevenSteps.setCompletedate1(new Date());
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);


        /**
         * 更新 工具/人关系  责任人→代办  审核人→沉默状态0
         */
        toolsPersonService.updatescarnext(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">通过");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :10:07 2019/7/10
     * @Description: 4-6 步 责任人 继续填写数据
     */

    @RequestMapping("jumpSevenStepsfour/{toolsId}/{questionId}")
    public String jumpSevenStepsfour(@PathVariable("toolsId") String toolsId,
                                     @PathVariable("questionId") String questionId,
                                     Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.scarfour(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scarfour";
    }


    /**
     * @Author : wdxu
     * @Date :13:22 2019/7/10
     * @Description: 更新 4-6 数据 责任人提交
     */

    @RequestMapping("updateToolsPersonTypefour")
    @ResponseBody
    public JsonResult updateToolsPersonTypefour(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {

        toolsSevenSteps.setBack3("4");//步数更新
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 30);
        Date date = new Date(calendar.getTimeInMillis());
        toolsSevenSteps.setTargetdate2(date);//目标日期
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系  责任人已办 审核人代办
         */
        toolsPersonService.updatescarfour(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<"+  permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() +">审核");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack2()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }

    /**
     * @Author : wdxu
     * @Date :13:43 2019/7/10
     * @Description: 责任人提交数据回显
     */
    @RequestMapping("showSevenStepfour/{id}")
    public String showSevenStepfour(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scarfouronlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :13:59 2019/7/17
     * @Description: 审核人 查看 4-6提交的数据
     */
    @RequestMapping("viewResponsiblePersonData/{toolsId}/{questionId}")
    public String viewResponsiblePersonData(@PathVariable("toolsId") String toolsId,
                                            @PathVariable("questionId") String questionId,
                                            Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.findFourToSix(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "scar/scarFourToSix";
    }


    /**
     * @Author : wdxu
     * @Date :14:42 2019/7/17
     * @Description: 审核人 驳回 4-6 步数据
     */
    @RequestMapping("rejectFourToSix")
    @ResponseBody
    public JsonResult rejectFourToSix(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         *
         *更新 scar 状态
         *
         */
        String reject = request.getParameter("back4");
        toolsSevenSteps.setBack4(reject);
        toolsSevenSteps.setBack3("3");//驳回第三步
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         *
         *  * 更新工具与人关系
         *
         */
        toolsPersonService.updatescarfive(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">驳回");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :14:42 2019/7/17
     * @Description: 审核人 通过 4-6 步数据
     */
    @RequestMapping("passFourToSix")
    @ResponseBody
    public JsonResult passFourToSix(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         *
         *更新 scar 状态
         *
         */
        toolsSevenSteps.setBack3("5");
        toolsSevenSteps.setCompletedate2(new Date());
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);

        /**
         *
         *更新工具与人关系
         *
         */
        toolsPersonService.updatescarfive(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">通过");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :15:37 2019/7/17
     * @Description: 责任人填写7.1 数据
     */
    @RequestMapping("fillIn71/{toolsId}/{questionId}")
    public String fillIn71(@PathVariable("toolsId") String toolsId,
                           @PathVariable("questionId") String questionId,
                           Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.fillIn71(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "scar/scarfillIn71";
    }


    /**
     * @Author : wdxu
     * @Date :16:26 2019/7/17
     * @Description: 责任人 提交 更新7.1数据
     */
    @RequestMapping("updateFillIn71")
    @ResponseBody
    public JsonResult updateFillIn71(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {

        toolsSevenSteps.setBack3("6");//步数更新
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 7);
        Date date = new Date(calendar.getTimeInMillis());
        toolsSevenSteps.setTargetdate3(date);//目标日期
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系  责任人已办 审核人代办
         */
        toolsPersonService.updatescarfour(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<"+  permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() +">审核");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack2()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());

    }


    /**
     * @Author : wdxu
     * @Date :14:05 2019/7/10
     * @Description: 审核人   审核7.1  回显
     */
    @RequestMapping("showSevenStepfive/{toolsId}/{questionId}")
    public String showSevenStepfive(@PathVariable("toolsId") String toolsId,
                                    @PathVariable("questionId") String questionId,
                                    Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.scarfive(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "scar/scarfive";
    }


    /**
     * @Author : wdxu
     * @Date :17:14 2019/7/17
     * @Description: 审核人————驳回
     */
    @RequestMapping("updateSevenStepfive")
    @ResponseBody
    public JsonResult updateSevenStepfive(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * @Author : wdxu
         * @Date :17:14 2019/7/17
         * @Description:更新scar 状态
         */
        String reject = request.getParameter("back4");
        //toolsSevenSteps.setAttmentThree(null);//bug
        toolsSevenSteps.setBack4(reject);
        toolsSevenSteps.setBack3("5");//驳回第三步
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * @Author : wdxu
         * @Date :17:14 2019/7/17
         * @Description:更新工具与人关系
         */
        toolsPersonService.updatescarfive(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">驳回");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack2()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
     * @Author : wdxu
     * @Date :17:17 2019/7/17
     * @Description: 通过
     */
    @RequestMapping("updateSevenStepfivenext")
    @ResponseBody
    public JsonResult updateSevenStepfivenext(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * @Author : wdxu
         * @Date :17:17 2019/7/17
         * @Description: 更新scar 状态
         */
        toolsSevenSteps.setBack3("7");
        toolsSevenSteps.setCompletedate3(new Date());
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * @Author : wdxu
         * @Date :17:17 2019/7/17
         * @Description: 更新工具与人关系
         */
        toolsPersonService.updatescarfivenext(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">通过");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }


    /**
    * @Author : wdxu
    * @Date :17:42 2019/7/17
    * @Description: 7.2 审核人填写最后一步
    */
    @RequestMapping("jumpSevenStepsix/{toolsId}")
    public String jumpSevenStepsix(@PathVariable("toolsId") String toolsId, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(toolsId);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scarsix";
    }

    /**
    * @Author : wdxu
    * @Date :17:52 2019/7/17
    * @Description: 审核人填写最后一步跳转
    */
    @RequestMapping("theReviewerFillsInTheLast/{toolsId}/{questionId}")
    public String theReviewerFillsInTheLast(@PathVariable("toolsId") String toolsId,
                                            @PathVariable("questionId") String questionId,
                                            Model model, HttpServletRequest request){


        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.theReviewerFillsInTheLast(toolsId, questionId, person);
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(toolsId);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        //如果查询不到 则说明这个问题已经关闭
        if(null == toolsSevenStepss) {
            return "scar/scarAll";
        }
        return "scar/scarsix";
    }


    /*
    *//**
     * @Author : wdxu
     * @Date :18:51 2019/7/10
     * @Description: 更新
     */
    @RequestMapping("jumpSevenStepsixupdate")
    @ResponseBody
    public JsonResult jumpSevenStepsixupdate(ToolsSevenSteps toolsSevenSteps,HttpServletRequest request) {
        toolsSevenSteps.setBack3("8");
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
       /**
       * @Author : wdxu
       * @Date :18:16 2019/7/17
       * @Description: 最后一步
       */
        toolsPersonService.scarupdatelast(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">处理完成");
        toolLog.setType(2);//scar
        toolLogService.addToolLog(toolLog);

        //发送邮件
//        ToolsSevenSteps sevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsSevenSteps.getId()));
//        Issue issue = apuCheckService.apuDetail(String.valueOf(sevenSteps.getIssueId()));
//        String title="BIMS系统通知";
//        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>问题编号：" +issue.getNumber() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
//        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(toolsSevenSteps.getBack1()).getEmail(),title,content);
        return JsonResult.success(toolsSevenSteps.getId());
    }




    /**
     * @Author : wdxu
     * @Date :14:53 2019/7/17
     * @Description:防止跳错页面的展示
     */
    @RequestMapping("jumpAll/{id}")
    public String jumpAll(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scarAll";
    }
}