package com.cummins.bims.controller;

import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.AdviceService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.CarService;
import com.cummins.bims.service.DictService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("bims/common")
@Controller
public class CommonPageController {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private DictService dictService;

    @Autowired
    private CarService carService;

    @Autowired
    private AdviceService adviceService;

    /**
     * 跳转通用 EQR页面
     * @return
     */
    @RequestMapping("Eqr")
    public String apuEqr(HttpServletRequest request, Model model){
        /*String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        return backpath+"/common/eqr";*/

        String path = backpath+"/common/eqr";
        return getComInfo(request, model,path);
    }

    /**
     * 跳转通用 Learder页面
     * @return
     */
    @RequestMapping("Learder")
    public String apuLearder(HttpServletRequest request, Model model){
        /*String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        return backpath+"/common/leader";*/

        String path = backpath+"/common/leader";
        return getComInfo(request, model,path);
    }

    /**
     * 跳转通用 EqrLearder页面
     * @return
     */
    @RequestMapping("EqrLearder")
    public String apuEqrapuLearder(HttpServletRequest request, Model model){
        /*String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        return backpath+"/common/eqr_leader";*/

        String path = backpath+"/common/eqr_leader";
        return getComInfo(request, model,path);
    }


    /**
     * 提交是否EQR
     * @param
     * @return
     */
    @RequestMapping("isEqr/{isEqr}")
    @ResponseBody
    public JsonResult isEqr(Bill bill, @PathVariable("isEqr") String isEqr,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        bill.setIsEqr(isEqr);
        Integer i = apuCheckService.isEqr(bill,person);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 选择处理工具
     * @param
     * @return
     */
    @RequestMapping("dealtool")
    @ResponseBody
    public JsonResult dealtool(DealTool dealTool,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = apuCheckService.dealtool(dealTool,person);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }


    /**
     * 跳转Car2-7.1填写页面
     * @return
     */
    @RequestMapping("toCarStep27")
    public String toCarStep27(HttpServletRequest request, Model model){
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/common/ts27";
    }

    /**
     * 跳转Car2-7.1填写页面
     * @return
     */
    @RequestMapping("toCarStep27detail")
    public String toCarStep27detail(HttpServletRequest request, Model model){
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/common/ts27detail";
    }

    /**
     * 跳转Car1-7.2质量经理审核页面
     * @return
     */
    @RequestMapping("toCarStepAll")
    public String toCarStepAll(HttpServletRequest request, Model model){
        String carId = request.getParameter("carId");
        String issueId = request.getParameter("issueId");
        Issue issue = apuCheckService.apuDetail(issueId);
        model.addAttribute("issue",issue);
        Car car = carService.getInfo(Integer.valueOf(carId));
        model.addAttribute("car",car);
        return backpath+"/common/tsall";
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
        return path;
    }
}
