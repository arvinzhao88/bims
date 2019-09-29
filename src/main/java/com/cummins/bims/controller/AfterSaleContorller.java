package com.cummins.bims.controller;

import com.cummins.bims.dao.PQCToolMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.AfterSaleService;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.NumberService;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.GenerateOrderNoUtil;
import com.cummins.util.JsonResult;
import com.cummins.util.SendMsg;
import com.cummins.util.ShiroUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("bims/aftersale")
public class AfterSaleContorller {

    @Autowired
    private AfterSaleService afterSaleService;
    @Autowired
    private NumberService nService;
    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private PQCToolMapper pqcToolMapper;

    @GetMapping("test")
    public void test() {
        try {
            SendMsg.qyWxMsg("aa000051", "111", "222", "ddd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author : wdxu
     * @Date :15:27 2019/7/1
     * @Description: 售后页面跳转
     */
    @RequestMapping("toAfterSale")
    public String toAfterSale(HttpServletRequest request, Model model) {
        return "back/bims/qualityissues/aftersale/aftersale_index";
    }


    /**
     * @Author : wdxu
     * @Date :16:30 2019/6/27
     * @Description: 跳转售后新建问题页面  自动生成创建日期;创建人;问题编号
     */
    @RequestMapping("afterSaleAdd")
    public String afterSaleAdd(HttpServletRequest request, Model model) {
        //当前登陆人
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        model.addAttribute("currentRegistrant", person.getName());
        //问题编号
        model.addAttribute("questionNumber", GenerateOrderNoUtil.gens("SH"));
        //录入时间
        Date date = new Date();
        model.addAttribute("entryTime", date);
        return "back/bims/qualityissues/aftersale/aftersale_addquestion";
    }

    /**
     * @Author : wdxu
     * @Date :15:27 2019/7/1
     * @Description: 售后页面跳转
     */
    @RequestMapping("toAfterSaleEqr")
    public String toAfterSaleEqr(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        AfterSaleIssue afterSaleIssue = afterSaleService.selectByIssueId(id);
        List<IssueShExt> shExtList = afterSaleService.getShExt(String.valueOf(afterSaleIssue.getId()));
        Issue issue = apuCheckService.apuDetail(id);
        model.addAttribute("afterSaleIssue",afterSaleIssue);
        model.addAttribute("shExtList", shExtList);
        model.addAttribute("issue", issue);
        return "back/bims/qualityissues/aftersale/issue_tool";
    }
    /**
     * @Author : wdxu
     * @Date :15:07 2019/6/28
     * @Description: 获取售后分页数据
     */
    @RequestMapping("getList")
    @ResponseBody
    public DatatablesView<IssueParam> getList(HttpServletRequest request, SearchParam search) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        search.setProcessPersonAccount(person.getAccount());
        Page<IssueParam> list = apuCheckService.getList1(search);
        DatatablesView<IssueParam> dataView = new DatatablesView<IssueParam>();
        dataView.setData(list);
        dataView.setRecordsTotal((int) list.getTotal());
        dataView.setDraw(search.getPageSize());
        return dataView;
    }

    /**
     * @Author : wdxu
     * @Date :17:58 2019/6/27
     * @Description: 售后问题保存
     */
    @RequestMapping("afterSalesProblemSaving")
    @ResponseBody
    public JsonResult afterSalesProblemSaving(HttpServletRequest request, AfterSaleIssue afterSaleIssue) {
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //生成编号
        String sn = nService.selectMaxSn("H");
        //插入Issue 表
        Issue issue =new Issue();
        issue.setInputPerson(String.valueOf(person.getId()));
        issue.setInputPresonName(person.getName());
        issue.setInputPersonAccount(person.getAccount());
        issue.setProcessPerson(String.valueOf(person.getId()));
        issue.setProcessPersonName(person.getName());
        issue.setProcessPersonAccount(person.getAccount());
        issue.setNumber(sn);
        //售后表
        afterSaleIssue.setInputTime(new Date());
        afterSaleIssue.setInputPerson(person.getAccount());
        afterSaleIssue.setInputPersonName(person.getName());
        /**
         * 保存 状态为1
         */
        afterSaleIssue.setType(1);
        afterSaleIssue.setQuestionType(1);
        afterSaleIssue.setNumber(sn);
        afterSaleService.addAfterSaleIssue(afterSaleIssue,issue,person);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :18:22 2019/7/1
     * @Description: 提交 状态为2
     */
    @RequestMapping("submitAfterSalesDatasecond")
    @ResponseBody
    public JsonResult submitAfterSalesDatasecond(HttpServletRequest request, AfterSaleIssue afterSaleIssue) {
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        //生成编号
        String sn = nService.selectMaxSn("H");
        //插入Issue 表
        Issue issue =new Issue();
        issue.setInputPerson(String.valueOf(person.getId()));
        issue.setInputPresonName(person.getName());
        issue.setInputPersonAccount(person.getAccount());
        issue.setProcessPerson(String.valueOf(person.getId()));
        issue.setProcessPersonName(person.getName());
        issue.setProcessPersonAccount(person.getAccount());
        issue.setNumber(sn);

        afterSaleIssue.setInputTime(new Date());
        afterSaleIssue.setInputPerson(person.getAccount());
        afterSaleIssue.setInputPersonName(person.getName());
        /**
         * 提交 状态为2
         */
        afterSaleIssue.setType(2);
        afterSaleIssue.setNumber(nService.selectMaxSn("H"));
        afterSaleService.addAfterSaleIssue(afterSaleIssue,issue,person);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :17:07 2019/6/28
     * @Description: 删除售后数据
     */
    @RequestMapping("deleteAfterSalesData")
    @ResponseBody
    public JsonResult deleteAfterSalesData(Integer id) {
        afterSaleService.deleteAfterSalesData(id);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :15:00 2019/7/1
     * @Description: 点击编辑按钮 跳转回显页面
     */
    @RequestMapping("jumpToEditTheAfterSalesPage/{id}")
    public String jumpToEditTheAfterSalesPage(@PathVariable("id") Integer id, Model model) {
        AfterSaleIssue afterSaleIssue = afterSaleService.queryAfterSaleById(id);
        model.addAttribute("afterSaleIssue", afterSaleIssue);
        return "back/bims/qualityissues/aftersale/aftersale_echo";
    }

    /**
     * @Author : wdxu
     * @Date :16:42 2019/7/1
     * @Description: 更新售后数据
     */
    @RequestMapping("updateAfterSalesData")
    @ResponseBody
    public JsonResult updateAfterSalesData(AfterSaleIssue afterSaleIssue) {
        /**
         * 保存 状态为1
         */
        afterSaleIssue.setType(1);
        afterSaleService.updateAfterSalesData(afterSaleIssue);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :16:42 2019/7/1
     * @Description: 提交售后数据
     */
    @RequestMapping("submitAfterSalesData")
    @ResponseBody
    public JsonResult submitAfterSalesData(AfterSaleIssue afterSaleIssue) {
        /**
         * 提交 状态为2
         */
        afterSaleIssue.setType(2);
        afterSaleService.updateAfterSalesData(afterSaleIssue);
        return JsonResult.success("success");
    }

    /**
     * @Author : wdxu
     * @Date :18:36 2019/7/1
     * @Description: 判断js 显示
     */
    @RequestMapping("judgmentDisplay")
    @ResponseBody
    public JsonResult judgmentDisplay(AfterSaleIssue afterSaleIssue) {
        AfterSaleIssue afterSaleIssue1 = afterSaleService.queryAfterSaleById(afterSaleIssue.getId());
        return JsonResult.success(afterSaleIssue1);
    }


    @RequestMapping("savePqc")
    @ResponseBody
    public JsonResult savePqc(PQCTool pqcTool) {
        pqcTool.setStatus("2");
        pqcTool.setCompleteDate(new Date());
        int i = pqcToolMapper.updateByPrimaryKeySelective(pqcTool);
        return JsonResult.success("操作成功");
    }

}
