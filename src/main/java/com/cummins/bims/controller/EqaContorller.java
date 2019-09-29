package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dto.Advice;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueExtend;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.service.AdviceService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
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
@RequestMapping("bims/eqa")
public class EqaContorller {
    private static final String backpath = "back/bims/qualityissues";
    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private AdviceService adviceService;

    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<IssueParam> getList(HttpServletRequest request, SearchParam search){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        search.setProcessPersonAccount(person.getAccount());
        Page<IssueParam> list = apuCheckService.getList1(search);
        DatatablesView<IssueParam> dataView = new DatatablesView<IssueParam>();
        if (list.size()>0){
            dataView.setData(list);
            dataView.setRecordsTotal((int) list.getTotal());
            dataView.setDraw(search.getPageNo());
            return dataView;
        }
        return dataView;
    }

    /**
     * 跳转EQA修正页面
     * @return
     */
    @RequestMapping("eqaCorrect")
    public String apuCorrect(HttpServletRequest request, Model model){
        String path = backpath+"/eqa/z_e_correct";
        return getEqaInfo(request, model,path);
    }
    /**
     * 跳转EQA处理页面
     * @return
     */
    @RequestMapping("eqaEqr")
    public String eqaEqr(HttpServletRequest request, Model model){
        String path = backpath+"/eqa/issue_tool";
        return getEqaInfo(request, model,path);
    }

    public String getEqaInfo(HttpServletRequest request, Model model,String path) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issue", issue);
        model.addAttribute("issueInfo", issueInfo);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        List<Advice> adviceList = adviceService.getListByIssueId(Integer.valueOf(id));
        model.addAttribute("adviceList", adviceList);
        return path;
    }
}
