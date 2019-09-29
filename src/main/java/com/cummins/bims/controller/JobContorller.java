package com.cummins.bims.controller;


import com.alibaba.fastjson.JSONObject;
import com.cummins.bims.dao.DictMapper;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueExtend;
import com.cummins.bims.dto.IssueJobReview;
import com.cummins.bims.dto.IssueParam;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.JobService;
import com.cummins.bims.service.NumberService;
import com.cummins.bims.service.SendEmailService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.permission.service.PermissionService;
import com.cummins.util.JsonResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bims/job")
public class JobContorller {
    private static final String backpath = "back/bims/qualityissues";

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private JobService jobService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private NumberService numberService;

    @Autowired
    private SendEmailService sendEmailService;

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
     * 跳转JOB1保存问题
     * @return
     */
    @RequestMapping(path = "jobAdd",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult jobAdd(Issue issue, HttpServletRequest request){
        //判断SO是否已经存在
        List<Issue> list = jobService.selectBySo(issue);
        if (list.size()>0){
            for (Issue i: list) {
                if ((i.getEsn()+i.getSo()).equals(issue.getEsn()+issue.getSo())){
                    return JsonResult.success("请选择新的ESN",-1);
                }
            }
        }
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        issue.setInputPerson(String.valueOf(person.getId()));
        issue.setInputPresonName(person.getName());
        issue.setInputPersonAccount(person.getAccount());
        //责任人
        /*BimsPerson bimsPerson = permissionService.getPersonByAcc(issue.getProcessPersonAccount());
        issue.setProcessPerson(String.valueOf(bimsPerson.getId()));
        issue.setProcessPersonName(bimsPerson.getName());*/

        String sn = numberService.selectMaxSn(issue.getQualityType());
        issue.setNumber(sn);
        Integer i = jobService.apuAdd(issue,person);
        if (i > 0) {
            this.sendEmail(request,issue.getReviewPerson(),sn,issue);
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 跳转JOB1修正页面
     * @return
     */
    @RequestMapping("jobCorrect")
    public String jobCorrect(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        return backpath+"/jobone/z_jo_correct";
    }

    /**
     * 跳转JOB1审核页面
     * @return
     */
    @RequestMapping("jobToleader")
    public String jobToleader(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);
        List<IssueJobReview> jobReviewList = jobService.getReviewList(id);
        IssueJobReview jobReview = jobService.getReview(id);
        model.addAttribute("jobReviewList", jobReviewList);
        model.addAttribute("jobReview", jobReview);
        return backpath+"/jobone/z_jo_leader";
    }



    /**
     * 跳转JOB1责任人处理页面
     * @return
     */
    @RequestMapping("jobToHandler")
    public String jobToHandler(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);
        List<IssueJobReview> jobReviewList = jobService.getReviewList(id);
        IssueJobReview jobReview = jobService.getReview(id);
        model.addAttribute("jobReviewList", jobReviewList);
        model.addAttribute("jobReview", jobReview);
        return backpath+"/jobone/z_jo_ts1";
    }


    /**
     * 责任人提交
     * @return
     */
    @RequestMapping(path = "jobReviewt1",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult jobReviewt1(HttpServletRequest request, IssueJobReview issueJobReview){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        issueJobReview.setHandlerPersonId(person.getId());
        issueJobReview.setHandlerPersonName(person.getName());
        issueJobReview.setHandlerPersonAccount(person.getAccount());
        Integer i = jobService.add(issueJobReview,person);
        if (i>0){
            return JsonResult.success("成功");
        }
        return JsonResult.failure("成功");
    }


    /**
     * 跳转JOB1责任人查看页面
     * @return
     */
    @RequestMapping("jobToHandlerView")
    public String jobToHandlerView(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);
        List<IssueJobReview> jobReviewList = jobService.getReviewList(id);
        IssueJobReview jobReview = jobService.getReview(id);
        model.addAttribute("jobReviewList", jobReviewList);
        model.addAttribute("jobReview", jobReview);
        return backpath+"/jobone/z_jo_ts1_info";
    }

    /**
     * 跳转JOB1审核人查看页面
     * @return
     */
    @RequestMapping("jobToleaderView")
    public String jobToleaderView(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("issue",issue);
        IssueExtend issueExtend = apuCheckService.getIssueExtend(issue);
        JSONObject object = JSONObject.parseObject(issueExtend.getAttribute());
        model.addAttribute("issueExtend", object);
        Map issueInfo = apuCheckService.getIssueInfo(id);
        model.addAttribute("issueInfo", issueInfo);
        List<IssueJobReview> jobReviewList = jobService.getReviewList(id);
        IssueJobReview jobReview = jobService.getReview(id);
        model.addAttribute("jobReviewList", jobReviewList);
        model.addAttribute("jobReview", jobReview);
        return backpath+"/jobone/z_jo_leader_info";
    }

    /**
     * 处理完成
     *
     * @param jobReview
     * @return
     */
    @RequestMapping("job1Close")
    @ResponseBody
    public JsonResult job1Close(IssueJobReview jobReview,HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = jobService.job1Close(jobReview, person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 驳回
     *
     * @param jobReview
     * @return
     */
    @RequestMapping("job1Reject")
    @ResponseBody
    public JsonResult job1Reject(IssueJobReview jobReview,HttpServletRequest request) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = jobService.job1Reject(jobReview, person);
        if (i > 0) {
            return JsonResult.success("成功", i);
        }
        return JsonResult.failure("失败");
    }

    /**
     * 发送邮件
     * @return
     */
    private boolean sendEmail(HttpServletRequest request,String toEmails, String issueNo,Issue issue) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        if (person != null) {
            return sendEmailService.sendEmail(person.getEmail(), toEmails, dictMapper.selectByPrimaryKey(Integer.valueOf(issue.getPlant())).getName()+'_'+issueNo+'_'+issue.getIssueDesc(),
                    "<br><strong>BIMS系统通知</strong><br><br>" + person.getName() + "（线边）提交任务，请及时在BIMS系统中处理，谢谢！<br><br>工厂："
                            + issue.getPlantName() + "<br><br>问题编号："+ issueNo +"<br><br>问题描述："+ issue.getIssueDesc() + "<br><br>时间：" + getFormatDate(new Date()) + "<br>");
        }
        return false;
    }

    /**
     * 日期格式化
     * @param date
     * @return
     */
    private String getFormatDate(Date date) {
        if (date != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return format.format(date);
        }
        return "";
    }
}
