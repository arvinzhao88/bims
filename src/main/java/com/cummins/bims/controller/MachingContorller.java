package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueExtend;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("bims/machine")
public class MachingContorller {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<IssueParam> getList(SearchParam search){
        Page<IssueParam> list = apuCheckService.getList(search);
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
     * 跳转机加修正页面
     * @return
     */
    @RequestMapping("machineCorrect")
    public String machineCorrect(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        return backpath+"/machining/z_j_correct";
    }
}
