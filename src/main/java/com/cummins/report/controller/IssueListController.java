package com.cummins.report.controller;

import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dao.DealToolPersonMapper;
import com.cummins.bims.dao.ToolNotificationMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.ToolEnum;
import com.cummins.bims.service.AdviceService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.CarService;
import com.cummins.bims.service.NotificationService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.report.service.IIssueListService;
import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.sevenstepscar.service.SevenStepsService;
import com.cummins.util.JsonResult;
import com.cummins.util.StringUtil;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 问题列表
 * @author qx
 */
@Controller
@RequestMapping("/report/issue")
public class IssueListController {
    @Autowired
    private IIssueListService service;
    @Autowired
    private ApuCheckService apuCheckService;
    @Autowired
    private AdviceService adviceService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;
    @Autowired
    private CarService carService;
    @Autowired
    private SevenStepsService sevenStepsService;
    @Autowired
    private ToolNotificationMapper toolNotificationMapper;
    @Autowired
    private PersonMapper personMapper;

    /**
     * 跳转list页面
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String toIssueList() {
        return "report/jsp/issue_list";
    }

    /**
     * 获取全部问题列表
     * @param param
     * @return
     */
    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ResponseBody
    public DatatablesView<IssueParam> getList(SearchParam param) {
        DatatablesView<IssueParam> dataView = new DatatablesView<>();
        if (param != null) {
//            Page<IssueParam> list = service.getAllIssueList(param);
            Page<IssueParam> list = apuCheckService.getList1(param);
            if (list != null && list.size() > 0) {
                dataView.setData(list);
                dataView.setRecordsTotal((int) list.getTotal());
                dataView.setDraw(param.getPageSize());
            }
        }
        return dataView;
    }

    /**
     * 跳转详情页
     * @return
     */
    @RequestMapping(value = "/toIssueInfo", method = RequestMethod.GET)
    public String apuEqr(HttpServletRequest request, Model model) {
        String measures = request.getParameter("measures");
        model.addAttribute("measures", measures);

        String path = "report/jsp/issue_info";
        return getComInfo(request, model,path);
    }

    private String getComInfo(HttpServletRequest request, Model model ,String path) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        Map info = apuCheckService.getIssueInfo(id);
        model.addAttribute("issue", issue);
        model.addAttribute("issueInfo", info);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        List<Advice> adviceList = adviceService.getListByIssueId(Integer.valueOf(id));
        model.addAttribute("adviceList", adviceList);
        Notification notification = notificationService.getNoticeByIssueId(id);
        model.addAttribute("notification", notification);
        return path;
    }

    /**
     * 动态加载工具标签 根据account查询自己可以看到的工具
     * @param dealTool
     * @return
     */
    @RequestMapping(value = "getToolTabs", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getToolTabs(DealToolPerson dealTool, HttpServletRequest request, Model model){
        DealToolPersonCriteria dealToolPersonCriteria = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = dealToolPersonCriteria.createCriteria();
        criteria.andIssueIdEqualTo(dealTool.getIssueId());
        criteria.andTypeEqualTo(new Byte("1"));

        List<DealToolPerson> tools = dealToolPersonMapper.selectByExample(dealToolPersonCriteria);

        //循环
        List<DealToolPerson> newTools = new ArrayList<>();
        for(DealToolPerson toolPerson : tools){
            /** 四种工具 1.car 2.scar 3.7 step 4.notification **/
            //car
            if((int)toolPerson.getToolType() == ToolEnum.CAR.getCode()) {
                toolPerson.setPathUrl("report/issue/toCar");
                //scar
            } else if((int)toolPerson.getToolType() == ToolEnum.SCAR.getCode()) {
                toolPerson.setPathUrl("report/issue/toScar");
                //STEP7
            } else if((int)toolPerson.getToolType() == ToolEnum.STEP7.getCode()) {
                toolPerson.setPathUrl("report/issue/toSevenStep");
                //Notification
            } else if((int)toolPerson.getToolType() == ToolEnum.Notification.getCode()) {
                toolPerson.setPathUrl("report/issue/toNotification");
            }
            newTools.add(toolPerson);
        }
        return JsonResult.success(newTools);
    }

    @RequestMapping("getTools")
    @ResponseBody
    public JsonResult getTools(DealToolPerson dealTool){
        DealToolPersonCriteria dealToolPersonCriteria = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria criteria = dealToolPersonCriteria.createCriteria();
        criteria.andIssueIdEqualTo(dealTool.getIssueId());

        List<DealToolPerson> tools = dealToolPersonMapper.selectByExample(dealToolPersonCriteria);
        return JsonResult.success(tools);
    }

    /**
     * 跳转car页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "toCar", method = RequestMethod.GET)
    public String toCar(HttpServletRequest request, Model model) {
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
        return "back/bims/qualityissues/apucheck/car_step_info_27_info";
    }

    /**
     * 跳转scar
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "toScar/{toolsid}/{questionId}", method = RequestMethod.GET)
    public String toScar(@PathVariable("toolsid") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "scar/scarAll";
    }

    /**
     * 跳转7step
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "toSevenStep/{toolsid}/{questionId}", method = RequestMethod.GET)
    public String toSevenStep(@PathVariable("toolsid") String id, Model model) {
        ToolsSevenSteps toolsSevenSteps = sevenStepsService.selectSevenStepsById(id);
        model.addAttribute("toolsSevenSteps", toolsSevenSteps);
        return "sevenstep/sevenstepsevenAll";
    }

    /**
     * 跳转notification
     * @return
     */
    @RequestMapping(value = "toNotification", method = RequestMethod.GET)
    public String toNotification(HttpServletRequest request, Model model) {
        Integer toolId = Integer.valueOf(request.getParameter("toolId"));
        ToolNotification toolNotification = toolNotificationMapper.selectByPrimaryKey(toolId);
        if(null != toolNotification && StringUtil.isNotBlank(toolNotification.getPostUser())) {
            PersonCriteria pemp = new PersonCriteria();
            PersonCriteria.Criteria query = pemp.createCriteria();
            query.andAccountEqualTo(toolNotification.getPostUser());
            List<Person> personList = personMapper.selectByExample(pemp);
            if(personList.size()>0) {
                toolNotification.setPerson(personList.get(0));
            }
        }
        Integer issueId = Integer.valueOf(request.getParameter("issueId"));
        model.addAttribute("toolId", toolId);
        model.addAttribute("issueId", issueId);
        model.addAttribute("notification", toolNotification);
        return "back/bims/qualityissues/apucheck/iframeNotification_info";
    }
}
