package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.*;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.DealLogUtil;
import com.cummins.util.JsonResult;
import com.cummins.util.ShiroUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bims/apucheck")
public class ApuCheckController {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private DictService dictService;

    @Autowired
    private CarService carService;

    @Autowired
    private NumberService numberService;

    @Autowired
    private AdviceService adviceService;

    @Autowired
    private DealToolPersonService dealToolPersonService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private SendEmailService sendEmailService;

    /**
     * APU及终检列表
     *
     * @param search
     * @return
     */
    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<IssueParam> getList(SearchParam search, HttpServletRequest request) {
        DatatablesView<IssueParam> dataView = new DatatablesView<>();
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        if (search != null) {
            search.setProcessPersonAccount(String.valueOf(person.getAccount()));
            search.setProcessPerson(String.valueOf(person.getId()));
            Page<IssueParam> list = apuCheckService.getList(search);
            if (list != null && list.size() > 0) {
                dataView.setData(list);
                dataView.setRecordsTotal((int) list.getTotal());
                dataView.setDraw(search.getPageSize());
            }
        }
        return dataView;
    }

    /**
     * 根据问题id查询子表数据
     *
     * @param issue
     * @return
     */
    @RequestMapping("getIssueExtend")
    @ResponseBody
    public JsonResult getIssueExtend(Issue issue) {
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        if (issueExtend != null) {
            return JsonResult.success(issueExtend);
        }
        return JsonResult.failure("获取数据失败");
    }

    /**
     * 新建问题
     *
     * @param issue
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult apuAdd(Issue issue, HttpServletRequest request) {
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        String sn = numberService.selectMaxSn(issue.getQualityType());
        issue.setNumber(sn);
        issue.setInputPerson(String.valueOf(person.getId()));
        issue.setInputPresonName(person.getName());
        issue.setInputPersonAccount(person.getAccount());
        Integer i = apuCheckService.apuAdd(issue,person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 删除问题
     *
     * @param issue
     * @return
     */
    @RequestMapping("del")
    @ResponseBody
    public JsonResult apudel(Issue issue) {
        Integer i = apuCheckService.apudel(issue);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 问题详情
     *
     * @param issue
     * @return
     */
    @RequestMapping("detail")
    @ResponseBody
    public JsonResult detail(Issue issue) {
        Issue i = apuCheckService.apuDetail(String.valueOf(issue.getId()));
        return JsonResult.success(i);
    }

    /**
     * 问题详情
     *
     * @param issue
     * @return
     */
    @RequestMapping("getIssueInfo")
    @ResponseBody
    public JsonResult getIssueInfo(Issue issue) {
        Map info = apuCheckService.getIssueInfo(String.valueOf(issue.getId()));
        return JsonResult.success(info);
    }

    /**
     * 跳转A区修正页面
     *
     * @return
     */
    @RequestMapping("apuCorrect")
    public String apuCorrect(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        return backpath + "/apucheck/apu_check_correct";
    }

    /**
     * 跳转APU EQR页面
     *
     * @return
     */
    @RequestMapping("apuEqr")
    public String apuEqr(HttpServletRequest request, Model model) {
        /*String id = request.getParameter("id");
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);

        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);*/
        //根据issueID查询deal_tool_person表的数据
        //dealToolPersonService.selectByIssueId(Integer.valueOf(id));

//        return backpath + "/apucheck/apu_check_eqr";

        String measures = request.getParameter("measures");
        model.addAttribute("measures", measures);

        String path = backpath+"/apucheck/apu_check_eqr";
        return getComInfo(request, model,path);
    }


    /**
     * 跳转APU EQR页面
     *
     * @return
     */
    @RequestMapping("apuIssueDesc")
    public String apuIssueDesc(HttpServletRequest request, Model model) {
        /*String id = request.getParameter("id");
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);

        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);*/
        //根据issueID查询deal_tool_person表的数据
        //dealToolPersonService.selectByIssueId(Integer.valueOf(id));

//        return backpath + "/apucheck/apu_check_eqr";

        String measures = request.getParameter("measures");
        model.addAttribute("measures", measures);

        String path = "/issue_desc";
        return getComInfo(request, model,path);
    }

    /**
     * 跳转APU Learder页面
     *
     * @return
     */
    @RequestMapping("apuLearder")
    public String apuLearder(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        return backpath + "/apucheck/apu_check_leader";
    }

    /**
     * 跳转APU EqrLearder页面
     *
     * @return
     */
    @RequestMapping("apuEqrLearder")
    public String apuEqrapuLearder(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        return backpath + "/apucheck/apu_check_eqr_leader";
    }

    /**
     * 修正问题
     *
     * @param issue
     * @return
     */
    @RequestMapping("correct")
    @ResponseBody
    public JsonResult apuCorrect(Issue issue, HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        issue.setProcessPerson(String.valueOf(person.getId()));
        issue.setProcessPersonName(person.getName());
        issue.setProcessPersonAccount(person.getAccount());
        Integer i = apuCheckService.apuCorrect(issue,person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 问题关闭
     *
     * @param issue
     * @return
     */
    @RequestMapping("closeIssue")
    @ResponseBody
    public JsonResult closeIssue(Issue issue,HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Boolean status = dealToolPersonService.getStatus(issue.getId());
        /*if (status) {
            Integer i = apuCheckService.closeIssue(issue,person);
            if (i > 0) {
                return JsonResult.success("成功", i);
            }
            return JsonResult.failure("失败");
        }else {
            return JsonResult.failure("有未关闭的工具!");
        }*/
        Integer i = apuCheckService.closeIssue(issue,person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 分类名
     *
     * @param dict
     * @return
     */
    @RequestMapping("getDictName")
    @ResponseBody
    private JsonResult getDictName(Dict dict) {
        Dict dict1 = dictService.getDictName(dict);
        if (dict1 != null) {
            return JsonResult.success(dict1);
        }
        return JsonResult.success(dict1);
    }

    /**
     * 提交是否EQR
     *
     * @param
     * @return
     */
    @RequestMapping("isEqr/{isEqr}/{eqrLeader}")
    @ResponseBody
    public JsonResult isEqr(Bill bill, @PathVariable("isEqr") String isEqr, @PathVariable("eqrLeader") String eqrLeader, HttpServletRequest request) {
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        bill.setIsEqr(isEqr);
        Integer i = apuCheckService.isEqrTrue(bill,eqrLeader,person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 选择处理工具
     *
     * @param
     * @return
     */
    @RequestMapping("dealtool")
    @ResponseBody
    public JsonResult dealtool(DealTool dealTool,HttpServletRequest request) {
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = apuCheckService.dealtool(dealTool,person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }


    /**
     * 跳转Car2-7.1填写页面
     *
     * @return
     */
    @RequestMapping("toCarStep27")
    public String toCarStep27(HttpServletRequest request, Model model) {
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue", issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car", car);
//        return backpath + "/apucheck/iframeApuCheckTs27";
        return backpath + "/apucheck/car_step_27";
    }

    /**
     * 跳转Car2-7.1填写页面
     *
     * @return
     */
    @RequestMapping("toCarStep27detail")
    public String toCarStep27detail(HttpServletRequest request, Model model) {
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue", issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car", car);
        List<CarExtend> list = carService.getExtCar(car);
        model.addAttribute("extCar",list);
        return backpath + "/apucheck/apu_check_ts27detail";
    }

    /**
     * 跳转Car1-7.2质量经理审核页面
     *
     * @return
     */
    @RequestMapping("toCarStepAll")
    public String toCarStepAll(HttpServletRequest request, Model model) {
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue", issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car", car);
        List<CarExtend> list = carService.getExtCar(car);
        model.addAttribute("extCar",list);
        return backpath + "/apucheck/apu_check_tsall";
    }



    public String getComInfo(HttpServletRequest request, Model model ,String path) {
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
}

