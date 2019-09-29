package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.AdviceService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bims/tzone")
public class TzoneContorller {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private AdviceService adviceService;

    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<IssueParam> getList(SearchParam search, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        search.setProcessPersonAccount(String.valueOf(person.getAccount()));
        Page<IssueParam> list = apuCheckService.getList(search);
        DatatablesView<IssueParam> dataView = new DatatablesView<IssueParam>();
        if (list.size()>0){
            dataView.setData(list);
            dataView.setRecordsTotal((int) list.getTotal());
            dataView.setDraw(search.getPageSize());
            return dataView;
        }
        return dataView;
    }


    /**
     * 新建问题
     * @param issue
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public JsonResult apuAdd(Issue issue,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = apuCheckService.apuAdd(issue,person);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }


    /**
     * 处理意见
     * @param issue
     * @return
     */
    @RequestMapping("sendAdvice")
    @ResponseBody
    public JsonResult sendAdvice(Issue issue,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = apuCheckService.sendAdvice(issue,person);
        if (i>0){
            return JsonResult.success("成功",i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 跳转T区修正页面
     * @return
     */
    @RequestMapping("tzoneCorrect")
    public String apuCorrect(HttpServletRequest request, Model model){
        String path = backpath+"/tzone/z_t_correct";
        return getTzoneInfo(request, model,path);
    }


    /**
     * 跳转T区处理意见页面
     * @return
     */
    @RequestMapping("tzoneSend")
    public String tzoneSend(HttpServletRequest request, Model model){
        String path = backpath+"/tzone/z_t_send";
        return getTzoneInfo(request, model,path);
    }

    /**
     * 跳转T区 EQR页面
     * @return
     */
    @RequestMapping("tEqr")
    public String apuEqr(HttpServletRequest request, Model model){
        String path = backpath+"/tzone/z_t_eqr";
        return getTzoneInfo(request, model,path);
    }

    /**
     * 跳转T区 Learder页面
     * @return
     */
    @RequestMapping("tLearder")
    public String apuLearder(HttpServletRequest request, Model model){
        String path = backpath+"/tzone/z_t_leader";
        return getTzoneInfo(request, model,path);
    }

    /**
     * 跳转T区 EqrLearder页面
     * @return
     */
    @RequestMapping("tEqrLearder")
    public String apuEqrapuLearder(HttpServletRequest request, Model model){
        String path = backpath+"/tzone/z_t_eqr_leader";
        return getTzoneInfo(request, model,path);
    }

    public String getTzoneInfo(HttpServletRequest request, Model model,String path) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue", issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        List<Advice> adviceList = adviceService.getListByIssueId(Integer.valueOf(id));
        model.addAttribute("adviceList", adviceList);
        return path;
    }
}
