package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dao.DictMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.AdviceService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.DictService;
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
@RequestMapping("bims/sqa")
public class SqaContorller {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private AdviceService adviceService;

    @Autowired
    private DictMapper dictMapper;

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
     * 跳转SQA修正页面
     * @return
     */
    @RequestMapping("sqaCorrect")
    public String apuCorrect(HttpServletRequest request, Model model){
        String path = backpath+"/sqa/z_s_correct";
        return getTzoneInfo(request, model,path);
    }

    /**
     * 跳转SQA处理页面
     * @return
     */
    @RequestMapping("sqaEqr")
    public String sqaEqr(HttpServletRequest request, Model model){
        String path = backpath+"/sqa/z_sqa_eqr";
        return getTzoneInfo(request, model,path);
    }


    public String getTzoneInfo(HttpServletRequest request, Model model,String path) {
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);
        model.addAttribute("issue", issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        List<Advice> adviceList = adviceService.getListByIssueId(Integer.valueOf(id));
        model.addAttribute("adviceList", adviceList);
        Dict line = dictMapper.selectByPrimaryKey(object.getIntValue("line"));
        model.addAttribute("line", line);
        return path;
    }

}
