package com.cummins.bims.controller;

import com.cummins.bims.dto.*;
import com.cummins.bims.enums.DictEnum;
import com.cummins.bims.service.*;
import com.cummins.permission.model.BimsPerson;
import com.cummins.sevenstepscar.service.ToolLogService;
import com.cummins.util.JsonResult;
import com.cummins.util.ToolLogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

import static com.cummins.util.DateUtil.format;

@RequestMapping("car")
@Controller
public class CarController {
    private static final String backpath = "back/bims/qualityissues";
    @Autowired
    private CarService carService;

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private DealToolPersonService dealToolPersonService;

    @Autowired
    private ToolLogService toolLogService;

    @Autowired
    private SendEmailService sendEmailService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "addStep1", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addStep1(Car car,HttpServletRequest request){
        Integer integer = carService.updStep1(car);

        //查询当前工具有谁来此处理
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setToolNo(String.valueOf(car.getId()));
        dealToolPerson.setIssueId(car.getIssueId());
        DealToolPerson nextPerson = dealToolPersonService.selectNextPerson(dealToolPerson);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = ToolLogUtil.getDealLog(person);
        toolLog.setToolId(car.getId());
        toolLog.setAction("发起人<"+person.getName()+">处理完成"+','+"等待责任人<"+nextPerson.getProcessPersonName()+">处理");
        toolLogService.addToolLog(toolLog);

        return JsonResult.success(integer);
    }

    /**
     * 跳转Car第一步编辑页面
     * @return
     */
    @RequestMapping("toCarStep1Edit")
    public String toCar(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/apucheck/apu_check_ts1";
    }

    /**
     * 跳转到iframe版的car页面 第一步编辑页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("toFrmCarStep1Edit")
    public String toFrmCar(HttpServletRequest request, Model model){
        String id = request.getParameter("issueId");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setToolNo(String.valueOf(car.getId()));
        List<DealToolPerson> dealToolPersonList = dealToolPersonService.selectList(dealToolPerson);
        DealToolPerson dealPerson = new DealToolPerson();
        if(dealToolPersonList.size()>0) {
            dealPerson = dealToolPersonList.get(0);
        }
        model.addAttribute("dealPerson", dealPerson);
        //根据工具ID查询person表中的状态

        return backpath+"/apucheck/iframeCar";
    }
    /**
     * 责任人填写car
     * @param car
     * @return
     */
    @RequestMapping(value = "updStep")
    @ResponseBody
    public JsonResult updStep(@RequestBody Car car,HttpServletRequest request){
        Integer integer = carService.updStep17(car);

        //查询当前工具有谁来此处理
        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setToolNo(String.valueOf(car.getId()));
        dealToolPerson.setIssueId(car.getIssueId());
        DealToolPerson nextPerson = dealToolPersonService.selectNextPerson(dealToolPerson);
        //工具日志
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        ToolLog toolLog = ToolLogUtil.getDealLog(person);
        toolLog.setToolId(car.getId());
        toolLog.setAction("责任人<"+person.getName()+">填写car2-7完成"+','+"等待审核人<"+nextPerson.getProcessPersonName()+">处理");
        toolLogService.addToolLog(toolLog);

        //发送邮件
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>工具编号：" +car.getCarNo() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(nextPerson.getProcessPersonAccount()).getEmail(),title,content);
        return JsonResult.success(integer);
    }

    /**
     * 获取extcar
     * @param car
     * @return
     */
    @RequestMapping("getExtCar")
    @ResponseBody
    public JsonResult getExtCar(Car car){
        List<CarExtend> list = carService.getExtCar(car);
        return JsonResult.success(list);
    }

    /**
     * 驳回
     * @param dealLog
     * @return
     */
    @RequestMapping("reject")
    @ResponseBody
    public JsonResult reject(DealLog dealLog,HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = carService.reject(dealLog,person);

        //查询当前工具有谁来此处理
//        DealToolPerson dealToolPerson = new DealToolPerson();
//        dealToolPerson.setToolNo(String.valueOf(dealLog.getId()));
//        dealToolPerson.setIssueId(dealLog.getIssueId());
//        DealToolPerson nextPerson = dealToolPersonService.selectNextPerson(dealToolPerson);
        //工具日志
        ToolLog toolLog = ToolLogUtil.getDealLog(person);
        toolLog.setToolId(dealLog.getCarId());
        toolLog.setAction("质量经理<"+person.getName()+">驳回"+','+"等待责任人重新处理");
        toolLogService.addToolLog(toolLog);

        Car info = carService.getInfo(dealLog.getCarId());
        //发送邮件
        String title="BIMS系统通知";
        String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>工具编号：" +info.getCarNo() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
        sendEmailService.sendEmail(person.getEmail(),personService.getPerson(info.getDutyPerson()).getEmail(),title,content);
        return JsonResult.success(i);
    }

    /**
     * 同意
     * @param dealLog
     * @return
     */
    @RequestMapping("agree")
    @ResponseBody
    public JsonResult agree(DealLog dealLog,HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = carService.agree(dealLog,person);

        //工具日志
        ToolLog toolLog = ToolLogUtil.getDealLog(person);
        toolLog.setToolId(dealLog.getCarId());
        toolLog.setAction("质量经理<"+person.getName()+">审核通过");
        toolLogService.addToolLog(toolLog);

        return JsonResult.success(i);
    }

    /**
     * 跳转Notification页面
     * @return
     */
    @RequestMapping("toNotification")
    public String toNotification(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/apucheck/apu_check_notification";
    }


    /**
     * 跳转Scar页面
     * @return
     */
    @RequestMapping("toScarStep1Edit")
    public String toScarStep1Edit(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/apucheck/apu_check_scar";
    }

    /**
     * 跳转7Step页面
     * @return
     */
    @RequestMapping("to7Step1Edit")
    public String to7Step1Edit(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/apucheck/apu_check_7step";
    }

    /**
     * 跳转质量经理审核页面
     * @return
     */
    @RequestMapping("toScarReview")
    public String toScarReview(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/apucheck/apu_check_scar_detail";
    }

    /**
     * Car页面跳转逻辑
     */
    @RequestMapping("toCarByToolPerson")
    public String toCarByToolPerson(HttpServletRequest request, Model model){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //问题id
        String issueId = request.getParameter("issueId");
        String carId = request.getParameter("carId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue", issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car", car);
        List<CarExtend> list = carService.getExtCar(car);
        model.addAttribute("extCar",list);

        DealToolPerson dealTool = new DealToolPerson();
        dealTool.setIssueId(Integer.valueOf(issueId));
        dealTool.setToolNo(carId);
        DealToolPerson dealToolPerson = dealToolPersonService.getDealToolPerson(dealTool,person);
        model.addAttribute("toolPerson", dealToolPerson);
        if(null == dealToolPerson) {    //null代表可能是发起人登录但是责任人审核人和质量经理都不是他
//            return backpath+"/apucheck/car_all_info";
            return backpath+"/apucheck/car_step_1info";
        }
        if (person.getAccount().equals(dealToolPerson.getIntPersonAccount())){//如果登录人是发起人
            //如果当前数据的status是0 则可编辑 否则都是只读
            if(dealToolPerson.getType() == 2) { //如果是审核人
                if(dealToolPerson.getStatus()==0) { //审核人的初始状态 则跳转到发起人的待办
                    DealToolPerson dealToolPerson1 = dealToolPersonService.selectByToolId(dealToolPerson);
                    if(dealToolPerson1.getStatus()==1) {
                        return backpath+"/apucheck/car_step_1info";
                    }
                    return backpath+"/apucheck/car_step_1";
                }else if(dealToolPerson.getStatus() == 1) { //如果是审核人的待办 则跳转到审核人待办页面
                    return backpath+"/apucheck/car_step_all";
                } else {    //跳转到总页面
                    return backpath+"/apucheck/car_all_info";
                }
            }else if (dealToolPerson.getType()== DictEnum.TYPE_REVIEW.getCode() && dealToolPerson.getStatus()==1 && person.getAccount().equals(dealToolPerson.getProcessPersonAccount())) {  //既是发起人又是审核人并且为待处理
                return backpath+"/apucheck/car_step_all";
            }else if (dealToolPerson.getType()== DictEnum.TYPE_DUTY.getCode() && dealToolPerson.getStatus()==0) {  //是发起人但是是责任人的初始状态
                return backpath+"/apucheck/car_step_1";
            }else if (dealToolPerson.getType()== DictEnum.QUALITY_ENGINEER.getCode() && dealToolPerson.getStatus()==1) {  //质量工程师并且状态为1 待办
                return backpath+"/apucheck/car_step_1";
            } else {                            //否则 则是发起人的以编辑 只读
                return backpath+"/apucheck/car_all_info";
            }
        }else if (dealToolPerson.getType()==1 && dealToolPerson.getStatus()==1){//责任人的待处理
            return backpath+"/apucheck/car_step_27";
        }else if (dealToolPerson.getType()==1 && dealToolPerson.getStatus()==2){//责任人的已处理
            return backpath+"/apucheck/car_step_27info";
        }else if (dealToolPerson.getType()==1 && dealToolPerson.getStatus()==3){//质量经理的驳回也是责任人的待处理
            return backpath+"/apucheck/car_step_27";
        }else if (dealToolPerson.getType()==2 && dealToolPerson.getStatus()==1){//审核人的待处理
            DealToolPerson dealToolPerson1 = dealToolPersonService.selectByToolId(dealToolPerson);
            if(null != dealToolPerson1) {
                if(dealToolPerson1.getStatus()==1) { //责任人未办
                    return backpath+"/apucheck/car_step_1info";
                } else {
                    return backpath+"/apucheck/car_step_all";
                }
            }
            return backpath+"/apucheck/car_step_all";
        }else if (dealToolPerson.getType()==2 && dealToolPerson.getStatus()==2){//审核人的已处理
            return backpath+"/apucheck/car_step_allinfo";
        }else if (dealToolPerson.getType()==2 && dealToolPerson.getStatus()==3){//质量经理的驳回也是审核人的待处理
            return backpath+"/apucheck/car_step_all";
        }else if (dealToolPerson.getType()==3 && dealToolPerson.getStatus()==1){//质量经理的待处理
            return backpath+"/apucheck/car_step_info_27";
        }else if (dealToolPerson.getType()==3 && dealToolPerson.getStatus()==2) {//质量经理的已处理
            return backpath+"/apucheck/car_step_info_27_info";
        }else if (dealToolPerson.getType()==3 && dealToolPerson.getStatus()==3 ||dealToolPerson.getStatus()==4) {//质量经理的驳回
            return backpath+"/apucheck/car_step_info_27_info";
        }else {
            return backpath+"/apucheck/car_all_info";
        }
    }


    /**
     * 填写Car7.2最后一步
     */
    @RequestMapping("addCarSteplast")
    @ResponseBody
    public JsonResult addCarSteplast(CarParam car,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer res = carService.addCarSteplast(car,person);
        if(res == -1) {
            return JsonResult.failure("质量经理不能为审核人或者发起人");
        } else  if(res == 0){
            return JsonResult.failure("提交失败");
        } else {
            //查询当前工具有谁来此处理
            DealToolPerson dealToolPerson = new DealToolPerson();
            dealToolPerson.setToolNo(String.valueOf(car.getId()));
            dealToolPerson.setIssueId(car.getIssueId());
            DealToolPerson nextPerson = dealToolPersonService.selectNextPerson(dealToolPerson);
            //工具日志
            ToolLog toolLog = ToolLogUtil.getDealLog(person);
            toolLog.setToolId(car.getId());
            toolLog.setAction("审核人<"+person.getName()+">处理完成"+','+"等待质量经理<"+nextPerson.getProcessPersonName()+">审核");
            toolLogService.addToolLog(toolLog);

            //发送邮件
            Car info = carService.getInfo(car.getId());
            String title="BIMS系统通知";
            String content="<br><strong>BIMS系统通知</strong><br><br>"+person.getName()+"提交任务，请及时在BIMS系统中处理，谢谢！<br><br>工具编号：" +info.getCarNo() +"<br><br>时间：" + format(new Date(), "yyyy-MM-dd") +"<br>";
            sendEmailService.sendEmail(person.getEmail(),personService.getPerson(nextPerson.getProcessPersonAccount()).getEmail(),title,content);
            return JsonResult.success(res);
        }
    }
}
