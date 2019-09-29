package com.cummins.sevenstepscar.controller;

import com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer;
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
 * @description: seven_step
 * @author: wdxu
 * @create: 2019-07-08 18:36
 */
@Controller
@RequestMapping("toolsSevenSteps")
public class SevenStepController {
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
         * @Date :11:37 2019/7/11
         * @Description: 发起人填写数据  步数为0 并且是发起人
         */
        if (toolsSevenSteps.getBack3().equals("0") && toolsSevenSteps.getBack5().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/jumpSevenSteps/" + questionId + "/" + toolsid + "/" + toolsSevenSteps.getBack1() + "/" + toolsSevenSteps.getBack2();
            return jumpSevenSteps(questionId, toolsid, toolsSevenSteps.getBack1(), toolsSevenSteps.getBack2(), model);
        }

        /**
         * @Author : wdxu
         * @Date :13:05 2019/7/11
         * @Description: 责任人  步数为1  当前登录人是责任人  1-3步数据填写
         */
        else if (toolsSevenSteps.getBack3().equals("1") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/jumpSevenStepstwo/" + toolsid + "/" + questionId;
            return jumpSevenStepstwo(toolsid, questionId, model, request);
        }
        /**
         * @Author : wdxu
         * @Date :13:19 2019/7/11
         * @Description: 责任人 步数为 2  当前 登录人是责任人  回显数据
         */
        else if (toolsSevenSteps.getBack3().equals("2") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/showSevenSteptwo/" + toolsid;
            return showSevenSteptwo(toolsid, model);
        }

        /**
         * @Author : wdxu
         * @Date :13:16 2019/7/11
         * @Description: 审核人 进行审核
         */
        else if (toolsSevenSteps.getBack3().equals("2") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/showSevenStepthree/" + toolsid + "/" + questionId;
            return showSevenStepthree(toolsid, questionId, model, request);
        }

        /**
         * @Author : wdxu
         * @Date :13:28 2019/7/11
         * @Description: 责任人再次填写 4-6步
         */
        else if (toolsSevenSteps.getBack3().equals("3") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/jumpSevenStepsfour/" + toolsid + "/" + questionId;
            return jumpSevenStepsfour(toolsid, questionId, model, request);
        }

        /**
         * @Author : wdxu
         * @Date :13:35 2019/7/11
         * @Description: 责任人 查看已经提交的数据
         */
        else if (toolsSevenSteps.getBack3().equals("4") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/showSevenStepfour/" + toolsid;
            return showSevenStepfour(toolsid, model);
        }

        /**
         * @Author : wdxu
         * @Date :13:38 2019/7/11
         * @Description: 审核人 审核4-6
         */

        else if (toolsSevenSteps.getBack3().equals("4") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/showSevenStepfive/" + toolsid + "/" + questionId;
            return showSevenStepfive(toolsid, questionId, model, request);
        }

        /**
         * @Author : wdxu
         * @Date :13:46 2019/7/11
         * @Description: 责任人填写7.1
         */
        else if (toolsSevenSteps.getBack3().equals("5") && toolsSevenSteps.getBack1().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/jumpSevenStepsix/" + toolsid;
            return fillInsevenStep(toolsid, questionId, model, request);
        }
        /**
         * @Author : wdxu
         * @Date :11:38 2019/8/9
         * @Description: 审核人查看7.1数据
         */
        else if (toolsSevenSteps.getBack3().equals("6") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
            return showSevenStepfive71(toolsid, questionId, model, request);
        }


        /**
         * @Author : wdxu
         * @Date :13:54 2019/7/11
         * @Description: 审核人填写7.1数据
         */
        else if (toolsSevenSteps.getBack3().equals("7") && toolsSevenSteps.getBack2().equals(bimsPerson.getAccount())) {
//            return "redirect:/bims/toolsSevenSteps/jumpSevenStepsixonlyshow/" + toolsid;
            return jumpSevenStepsix(toolsid, model);
        }

        /**
         * @Author : wdxu
         * @Date :14:20 2019/7/11
         * @Description: 其他
         */
        else {
            return jumpAll(toolsid, model);

        }

    }


    /**
     * @Author : wdxu
     * @Date :18:44 2019/7/8  参数：问题id  工具id  责任人account   审核人accounnt
     * @Description: onestep 根据传递的参数 回显数据
     */
    @RequestMapping("jumpSevenSteps/{id}/{toolsId}/{leadaccount}/{checkaccouunt}")
    public String jumpSevenSteps(@PathVariable("id") String id, @PathVariable("toolsId") String toolsId,
                                 @PathVariable("leadaccount") String leadaccount,
                                 @PathVariable("checkaccouunt") String checkaccouunt,
                                 Model model) {
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        model.addAttribute("toolsId", toolsId);
        model.addAttribute("leadaccount", leadaccount);
        model.addAttribute("checkaccouunt", checkaccouunt);
        return "sevenstep/sevenstepone";
    }

    /**
     * @Author : wdxu
     * @Date :9:29 2019/7/9   参数:七步Id
     * @Description: 更新seven step
     */
    @RequestMapping("updatesevenstep")
    @ResponseBody
    public JsonResult updatesevenstep(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         *  更新 七步数据
         */
        toolsSevenSteps.setIssueNumber(GenerateOrderNoUtil.gens(""));
        toolsSevenSteps.setType(1);
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
        toolsPersonService.updateToolsPersonType(toolsSevenSteps);
        //增加工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交责任人<" + permissionService.getPersonByAcc(toolsSevenSteps.getBack1()).getName() + ">处理");
        toolLog.setType(3);//七步
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
     * @Date :11:11 2019/7/9
     * @Description: 提交之后数据回显
     */
    @RequestMapping("showSevenStep/{id}")
    public String showSevenStep(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevensteponeonlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :11:33 2019/7/9  责任人 登录
     * @Description: 七步 第二步   参数；工具id /问题Id
     */
    @RequestMapping("jumpSevenStepstwo/{toolsId}/{questionId}")
    public String jumpSevenStepstwo(@PathVariable("toolsId") String toolsId,
                                    @PathVariable("questionId") String questionId,
                                    Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.selectSevensteptwo(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevensteptwo";
    }


    /**
     * @Author : wdxu
     * @Date :15:32 2019/7/9
     * @Description: 第二部 提交问题 更新数据
     */
    @RequestMapping("updatesevensteptwo")
    @ResponseBody
    public JsonResult updatesevensteptwo(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         *  更新 七步数据
         */
        toolsSevenSteps.setBack3("2");//第二步
        //toolsSevenSteps.setBack4(toolsSevenSteps.getBack4());//驳回原因
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * 更新 工具/人关系
         */
        toolsPersonService.updateToolsPersonTypetwo(toolsSevenSteps);
        //增加工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<" + permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() + ">处理");
        toolLog.setType(3);//七步
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
     * @Date :17:01 2019/7/9
     * @Description: 提交之后回显
     */
    @RequestMapping("showSevenSteptwo/{id}")
    public String showSevenSteptwo(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevensteponetwoonlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :17:24 2019/7/9
     * @Description: 七步 第三部
     */
    @RequestMapping("showSevenStepthree/{toolsId}/{questionId}")
    public String showSevenStepthree(@PathVariable("toolsId") String toolsId,
                                     @PathVariable("questionId") String questionId,
                                     Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.selectSevenstepthree(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "sevenstep/sevensteponethree";
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
        toolsPersonService.updateToolsPersonTypethree(toolsSevenSteps);
        //增加工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">驳回");
        toolLog.setType(3);//七步
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
        toolsPersonService.updateToolsPersonTypethreenext(toolsSevenSteps);
        //增加工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">通过");
        toolLog.setType(3);//七步
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
     * @Date :10:07 2019/7/10
     * @Description: 4-6 步 责任人 继续填写数据
     */
    @RequestMapping("jumpSevenStepsfour/{toolsId}/{questionId}")
    public String jumpSevenStepsfour(@PathVariable("toolsId") String toolsId,
                                     @PathVariable("questionId") String questionId,
                                     Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.selectSevenstepfour(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevensteponefour";
    }


    /**
     * @Author : wdxu
     * @Date :13:22 2019/7/10
     * @Description: 4-6 步 责任人 责任人提交数据
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
         * 更新 工具/人关系  责任人→已处理  审核人→沉默状态0
         */
        toolsPersonService.updateToolsPersonTypefour(toolsSevenSteps);
        //增加工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<" + permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() + ">审核");
        toolLog.setType(3);//七步
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
        return "sevenstep/sevenstepfouronlyshow";
    }


    /**
     * @Author : wdxu
     * @Date :14:05 2019/7/10
     * @Description: 审核人  审核4-6 提交的数据 审核是否驳回或通过 回显
     */
    @RequestMapping("showSevenStepfive/{toolsId}/{questionId}")

    public String showSevenStepfive(@PathVariable("toolsId") String toolsId,
                                    @PathVariable("questionId") String questionId,
                                    Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.selectSevenstepfive(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "sevenstep/sevenstepfive";
    }


    /**
     * @Author : wdxu
     * @Date :14:05 2019/7/10
     * @Description: 审核人4-6————驳回
     */
    @RequestMapping("updateSevenStepfive")
    @ResponseBody
    public JsonResult updateSevenStepfive(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * @Author : wdxu
         * @Date :9:35 2019/8/9
         * @Description: 更新七步 状态
         */
        String reject = request.getParameter("back4");
        toolsSevenSteps.setBack4(reject);
        toolsSevenSteps.setBack3("3");//驳回第三步
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /**
         * @Author : wdxu
         * @Date :9:35 2019/8/9
         * @Description: 更新工具与人关系
         */
        toolsPersonService.updateToolsPersonTypefive(toolsSevenSteps);
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        /**
         * @Author : wdxu
         * @Date :9:38 2019/8/9
         * @Description: 工具日志
         */
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">驳回");
        toolLog.setType(3);//七步
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
     * @Date :14:05 2019/7/10
     * @Description: 审核人————通过
     */
    @RequestMapping("updateSevenStepfivenext")
    @ResponseBody
    public JsonResult updateSevenStepfivenext(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /*
         * 更新七步 状态
         */
        toolsSevenSteps.setBack3("5");
        toolsSevenSteps.setCompletedate2(new Date());
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
        /*
         * 更新工具与人关系
         */
        toolsPersonService.updateToolsPersonTypefive(toolsSevenSteps);
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        /*
         * 工具日志
         */
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">通过");
        toolLog.setType(3);//七步
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
     * @Date :10:17 2019/8/9
     * @Description: 责任人填写7.1数据 跳转页面
     */
    @RequestMapping("fillInsevenStep/{toolsId}/{questionId}")
    public String fillInsevenStep(@PathVariable("toolsId") String toolsId,
                                  @PathVariable("questionId") String questionId,
                                  Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.fillInsevenStep(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "sevenstep/fillInsevenStep";
    }


    /**
     * @Author : wdxu
     * @Date :10:51 2019/8/9
     * @Description: 责任人 提交7.1数据
     */
    @RequestMapping("updateFillInStep")
    @ResponseBody
    public JsonResult updateFillInStep(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {

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
        toolsPersonService.updateSevenstepfour(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("提交审核人<" + permissionService.getPersonByAcc(toolsSevenSteps.getBack2()).getName() + ">审核");
        toolLog.setType(3);//7step
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
     * @Date :11:13 2019/8/9
     * @Description: 审核人审核7.1提交的数据
     */
    @RequestMapping("showSevenStepfive71/{toolsId}/{questionId}")
    public String showSevenStepfive71(@PathVariable("toolsId") String toolsId,
                                      @PathVariable("questionId") String questionId,
                                      Model model, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //根据当前登录人 查询有哪些代办数据
        ToolsSevenSteps toolsSevenStepss = sevenStepsService.view71Data(toolsId, questionId, person);
        Integer toolsid = toolsSevenStepss.getId();
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(String.valueOf(toolsid));
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        model.addAttribute("questionId", questionId);
        return "sevenstep/showSevenStepfive71";
    }


    /**
     * @Author : wdxu
     * @Date :13:03 2019/8/9
     * @Description: 审核人驳回7.1数据
     */

    @RequestMapping("updateSevenStep71")
    @ResponseBody
    public JsonResult updateSevenStep71(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        /**
         * @Author : wdxu
         * @Date :17:14 2019/7/17
         * @Description:更新七步状态
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
        toolsPersonService.updatesevenStep71(toolsSevenSteps);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">驳回");
        toolLog.setType(3);//7step
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
     * @Date :13:24 2019/8/9
     * @Description: 审核人通过7.1数据
     */
    @RequestMapping("updateSevenStepfivenext71")
    @ResponseBody
    public JsonResult updateSevenStepby(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
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
        toolsPersonService.updatescarfiveby(toolsSevenSteps);

        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<" + person.getName() + ">通过");
        toolLog.setType(3);//7step
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
     * @Date :15:38 2019/7/10
     * @Description: 7.2 审核人填写最后一步
     */

    @RequestMapping("jumpSevenStepsix/{toolsId}")
    public String jumpSevenStepsix(@PathVariable("toolsId") String toolsId, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(toolsId);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevenstepsix";
    }

    /**
     * @Author : wdxu
     * @Date :18:51 2019/7/10
     * @Description: 更新
     */
    @RequestMapping("jumpSevenStepsixupdate")
    @ResponseBody
    public JsonResult jumpSevenStepsixupdate(ToolsSevenSteps toolsSevenSteps, HttpServletRequest request) {
        toolsSevenSteps.setBack3("8");
        sevenStepsService.updateSevenStepsById(toolsSevenSteps);
      /**
      * @Author : wdxu
      * @Date :13:43 2019/8/9
      * @Description: 更新结束状态
      */
        toolsPersonService.jumpSevenStependupdate(toolsSevenSteps);
        /**
        * @Author : wdxu
        * @Date :13:46 2019/8/9
        * @Description: 工具日志
        */
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = new ToolLog();
        toolLog.setToolId(toolsSevenSteps.getId());//工具Id
        toolLog.setProcessTime(new Date());//处理时间
        toolLog.setProcessPerson(person.getName());//处理人
        toolLog.setProcessPersonAccount(person.getAccount());//处理人Account
        toolLog.setProcessPersonId(String.valueOf(person.getId()));//处理人Id
        toolLog.setAction("审核人<"+person.getName()+">处理完成");
        toolLog.setType(3);//七步
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
     * @Date :14:03 2019/7/11
     * @Description: 防止跳错页面的展示
     */
    @RequestMapping("jumpAll/{id}")
    public String jumpAll(@PathVariable("id") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevenstepsevenAll";
    }
}