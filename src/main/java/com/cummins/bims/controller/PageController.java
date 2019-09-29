package com.cummins.bims.controller;

import com.cummins.bims.dao.PQCToolMapper;
import com.cummins.bims.dao.ToolNotificationMapper;
import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.PQCTool;
import com.cummins.bims.dto.ToolNotification;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.NotificationService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.GenerateOrderNoUtil;
import com.cummins.util.ShiroUtils;
import com.cummins.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("back")
public class PageController {

    private static final String backpath = "back/bims/qualityissues";

    private static final String webpath = "bims/";

    @Autowired
    private ToolNotificationMapper toolNotificationMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PQCToolMapper pqcToolMapper;

//------------------------------------------------------A区页面跳转----------------------------------------------------------------

    /**
     * 跳转A区页面
     *
     * @return
     */
    @RequestMapping("toAzone")
    public String toAzone(HttpServletRequest request, Model model) {
        return backpath + "back/bims/qualityissues/azone/z_a_index";
    }

    /**
     * 跳转A区新建问题页面
     *
     * @return
     */
    @RequestMapping("azoneAdd")
    public String azoneAdd(HttpServletRequest request, Model model) {
        return backpath + "/azone/z_a_new";
    }

    /**
     * 跳转A区修正页面
     *
     * @return
     */
    @RequestMapping("azoneCorrect")
    public String azoneCorrect(HttpServletRequest request, Model model) {
        return backpath + "/azone/z_a_correct";
    }


//-------------------------------------------------------下线页面跳转---------------------------------------------------------------

    /**
     * 跳转下线页面
     *
     * @return
     */
    @RequestMapping("offline")
    public String offline(HttpServletRequest request, Model model) {
        return backpath + "/offline/z_x_index";
    }

    /**
     * 跳转下线新建问题页面
     *
     * @return
     */
    @RequestMapping("offlineAdd")
    public String offlineAdd(HttpServletRequest request, Model model) {
        return backpath + "/offline/z_x_new";
    }

    /**
     * 跳转下线修正页面
     *
     * @return
     */
    @RequestMapping("offlineCorrect")
    public String offlineCorrect(HttpServletRequest request, Model model) {
        return backpath + "/offline/z_x_correct";
    }

//-------------------------------------------------------APU及终检---------------------------------------------------------------

    /**
     * 跳转A区页面
     *
     * @return
     */
    @RequestMapping("toApu")
    public String toApu(HttpServletRequest request, Model model) {
        return backpath + "/apucheck/apu_check_index";
    }

    /**
     * 跳转A区新建问题页面
     *
     * @return
     */
    @RequestMapping("toApuAdd")
    public String toApuAdd(HttpServletRequest request, Model model) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        return backpath + "/apucheck/apu_check_new";
    }


//-------------------------------------------------------T区页面跳转---------------------------------------------------------------

    /**
     * 跳转T区页面
     *
     * @return
     */
    @RequestMapping("toTzone")
    public String toTzone(HttpServletRequest request, Model model) {
        return backpath + "/tzone/z_t_index";
    }

    /**
     * 跳转T区新建问题页面
     *
     * @return
     */
    @RequestMapping("tzoneAdd")
    public String tzoneAdd(HttpServletRequest request, Model model) {
        return backpath + "/tzone/z_t_new";
    }

    /**
     * 跳转T区修正页面
     *
     * @return
     */
    @RequestMapping("tzoneCorrect")
    public String tzoneCorrect(HttpServletRequest request, Model model) {
        return backpath + "/tzone/z_t_correct";
    }

//--------------------------------------------------------机加页面跳转--------------------------------------------------------------

    /**
     * 跳转机加页面
     *
     * @return
     */
    @RequestMapping("toMachine")
    public String toMachine(HttpServletRequest request, Model model) {
        return backpath + "/machining/z_j_index";
    }

    /**
     * 跳转机加新建问题页面
     *
     * @return
     */
    @RequestMapping("machineAdd")
    public String machineAdd(HttpServletRequest request, Model model) {
        return backpath + "/machining/z_j_new";
    }

    /**
     * 跳转修正页面
     *
     * @return
     */
    @RequestMapping("machineCorrect")
    public String machineCorrect(HttpServletRequest request, Model model) {
        return backpath + "/machining/z_j_correct";
    }


//--------------------------------------------------------Job1页面跳转--------------------------------------------------------------

    /**
     * 跳转Job1页面
     *
     * @return
     */
    @RequestMapping("toJobOne")
    public String toJobOne(HttpServletRequest request, Model model) {
        return backpath + "/jobone/z_jo_index";
    }

    /**
     * 跳转Job1新建问题页面
     *
     * @return
     */
    @RequestMapping("jobOneAdd")
    public String jobOneAdd(HttpServletRequest request, Model model) {
        return backpath + "/jobone/z_jo_new";
    }

    /**
     * 跳转Job1修正页面
     *
     * @return
     */
    @RequestMapping("jobOneCorrect")
    public String jobOneCorrect(HttpServletRequest request, Model model) {
        return backpath + "/jobone/z_jo_correct";
    }


//--------------------------------------------------------BIS页面跳转--------------------------------------------------------------

    /**
     * 跳转BIS页面
     *
     * @return
     */
    @RequestMapping("toBis")
    public String toBis(HttpServletRequest request, Model model) {
        return backpath + "/bis/z_b_index";
    }

    /**
     * 跳转BIS新建问题页面
     *
     * @return
     */
    @RequestMapping("bisAdd")
    public String bisAdd(HttpServletRequest request, Model model) {
        return backpath + "/bis/z_b_new";
    }

    /**
     * 跳转BIS修正页面
     *
     * @return
     */
    @RequestMapping("bisCorrect")
    public String bisCorrect(HttpServletRequest request, Model model) {
        return backpath + "/bis/z_b_correct";
    }

//--------------------------------------------------------EQA页面跳转--------------------------------------------------------------

    /**
     * 跳转EQA页面
     *
     * @return
     */
    @RequestMapping("toEqa")
    public String toEqa(HttpServletRequest request, Model model) {
        return backpath + "/eqa/z_e_index";
    }

    /**
     * 跳转EQA新建问题页面
     *
     * @return
     */
    @RequestMapping("eqaAdd")
    public String eqaAdd(HttpServletRequest request, Model model) {
        return backpath + "/eqa/z_e_new";
    }

    /**
     * 跳转EQA修正页面
     *
     * @return
     */
    @RequestMapping("eqaCorrect")
    public String eqaCorrect(HttpServletRequest request, Model model) {
        return backpath + "/eqa/z_e_correct";
    }

//---------------------------------------------------------SQA页面跳转-------------------------------------------------------------

    /**
     * 跳转SQA页面
     *
     * @return
     */
    @RequestMapping("toSqa")
    public String toSqa(HttpServletRequest request, Model model) {
        return backpath + "/sqa/z_s_index";
    }

    /**
     * 跳转SQA新建问题页面
     *
     * @return
     */
    @RequestMapping("sqaAdd")
    public String sqaAdd(HttpServletRequest request, Model model) {
        return backpath + "/sqa/z_s_new";
    }

    /**
     * 跳转SQA修正页面
     *
     * @return
     */
    @RequestMapping("sqaCorrect")
    public String sqaCorrect(HttpServletRequest request, Model model) {
        return backpath + "/sqa/z_s_correct";
    }

//-------------------------------------------------------售后页面跳转---------------------------------------------------------------

    /**
     * 跳转售后页面
     *
     * @return
     */
    /*@RequestMapping("toAfterSale")
    public String toAfterSale(HttpServletRequest request, Model model) {
        return "back/bims/qualityissues/aftersale/z_sh_index";
    }*/

    /**
     * @Author : wdxu
     * @Date :16:30 2019/6/27
     * @Description: 跳转售后新建问题页面  自动生成创建日期;创建人;问题编号
     */
    /*@RequestMapping("afterSaleAdd")
    public String afterSaleAdd(HttpServletRequest request, Model model) {
        //当前登陆人
        model.addAttribute("currentRegistrant", ShiroUtils.getSysUser().getName());
        //问题编号
        model.addAttribute("questionNumber", GenerateOrderNoUtil.gens("SH"));
        //录入时间
        Date date = new Date();
        model.addAttribute("entryTime", date);
        return "back/bims/qualityissues/aftersale/z_sh_new";
    }*/

    /**
     * 跳转售后修正页面
     *
     * @return
     */
    @RequestMapping("afterSaleCorrect")
    public String afterSaleCorrect(HttpServletRequest request, Model model) {
        return backpath + "/aftersale/z_sh_correct";
    }

//=======================================================================================================================
    /**
     * 跳转tool_notification页面
     *
     * @return
     */
    @RequestMapping("toolNotification")
    public String toolNotification(HttpServletRequest request, Model model) {
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
        return backpath + "/apucheck/iframeNotification";
    }

    /**
     * 跳转tool_PQC页面
     *
     * @return
     */
    @RequestMapping("toPqc")
    public String toPqc(HttpServletRequest request, Model model) {
        Integer toolId = Integer.valueOf(request.getParameter("toolId"));
        Integer issueId = Integer.valueOf(request.getParameter("issueId"));
        model.addAttribute("toolId", toolId);
        model.addAttribute("issueId", issueId);
        PQCTool pqcTool = pqcToolMapper.selectByPrimaryKey(toolId);
        model.addAttribute("pqcTool", pqcTool);
        return backpath + "/aftersale/z_sh_ts1";
    }

}
