package com.cummins.bims.controller;

import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.DeskService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.JsonResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bims/desk")
public class DeskContorller {

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private DeskService deskService;

    /**
     * 各区待办列表
     * @param search
     * @return
     */
    @RequestMapping("areatolist")
    @ResponseBody
    public DatatablesView<IssueParam> areatolist(HttpServletRequest request, SearchParam search){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        DatatablesView<IssueParam> dataView = new DatatablesView<>();
        if (search != null) {
            String qType = search.getQualityType();
            if (qType != null) {
                int qNum = 0;
                switch (qType) {
                    case "T": {
                        qNum = 1;
                        break;
                    }
                    case "M": {
                        qNum = 2;
                        break;
                    }
                    case "J": {
                        qNum = 3;
                        break;
                    }
                    case "B": {
                        qNum = 4;
                        break;
                    }
                    case "E": {
                        qNum = 5;
                        break;
                    }
                    case "S": {
                        qNum = 6;
                        break;
                    }
                    case "H": {
                        qNum = 7;
                        break;
                    }
                    case "A": {
                        qNum = 8;
                        break;
                    }
                    default:
                        break;
                }
                if (person.getBelongArea().contains(qNum + "X") && !person.getBelongArea().contains(qNum + "F")) {
                    search.setPlant("63");
                }
                if (!person.getBelongArea().contains(qNum + "X") && person.getBelongArea().contains(qNum + "F")) {
                    search.setPlant("64");
                }
            }
            search.setProcessStatus("0");
            Page<IssueParam> list = apuCheckService.getList1(search);
//            Page<IssueParam> list = deskService.getUnListByArea(search);
            if (list != null) {
                dataView.setData(list);
                dataView.setRecordsTotal((int) list.getTotal());
                dataView.setDraw(search.getPageSize());
            }
        }
        return dataView;
    }

    /**
     * 我的待办/已办列表
     * @param search
     * @param request
     * @return
     */
    @RequestMapping("mytodolis")
    @ResponseBody
    public DatatablesView<IssueParam> mytodolis(SearchParam search, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        DatatablesView<IssueParam> dataView = new DatatablesView<>();
        if (search != null) {
            search.setProcessPersonAccount(String.valueOf(person.getAccount()));
            Page<IssueParam> list = apuCheckService.getList1(search);
            //Page<IssueParam> list = deskService.getDeskListByStatus(search);
            if (list != null) {
                dataView.setData(list);
                dataView.setRecordsTotal((int) list.getTotal());
                dataView.setDraw(search.getPageSize());
            }
        }
        return dataView;
    }

    //各区工作台待办条数
    @RequestMapping("getDeskByArea")
    @ResponseBody
    public JsonResult getDeskByArea(SearchParam searchParam){
        List<Map> issueAmount = deskService.getIssueAmount(searchParam);
        return JsonResult.success(issueAmount);
    }


    //我的工作台待办条数
//    @RequestMapping("getMyDesk")
//    @ResponseBody
//    public JsonResult getMyDesk(IssueParam issueParam, HttpServletRequest request){
//        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
//        issueParam.setProcessPersonAccount(String.valueOf(person.getAccount()));
//        List<Map> myIssueAmount = deskService.getMyDeskAmount(issueParam);
//        return JsonResult.success(myIssueAmount);
//    }

    //接收问题
    @RequestMapping("receive")
    @ResponseBody
    public JsonResult receive(Issue issue, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
//        Issue issue1 = apuCheckService.apuDetail(String.valueOf(issue.getId()));
//        if ("T".equals(issue1.getQualityType())){
//            if(person.getAccount().equals(issue1.getProcessPersonAccount())){
//                Integer i = apuCheckService.receive(issue,person);
//                return JsonResult.success(i);
//            }else {
//                return JsonResult.failure("无权操作");
//            }
//        }
        Integer i = apuCheckService.receive(issue,person);
        return JsonResult.success(i);
    }

    //驳回问题
    @RequestMapping("reject")
    @ResponseBody
    public JsonResult reject(Issue issue, HttpServletRequest request){
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
//        Issue issue1 = apuCheckService.apuDetail(String.valueOf(issue.getId()));
//        if ("T".equals(issue1.getQualityType())){
//            if(person.getAccount().equals(issue1.getProcessPersonAccount())){
//                Integer i = apuCheckService.receive(issue,person);
//                return JsonResult.success(i);
//            }else {
//                return JsonResult.failure("无权操作");
//            }
//        }
        Integer i = apuCheckService.reject(issue,person);
        return JsonResult.success(i);
    }
}
