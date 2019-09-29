package com.cummins.pad.controller;

import com.alibaba.fastjson.JSON;
import com.cummins.bims.dto.Issue;
import com.cummins.pad.service.IGetwxpropService;
import com.cummins.pad.service.IIssueService;
import com.cummins.printer.model.Printer;
import com.cummins.printer.service.IPrinterService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * pad端
 * @author qixiao
 */
@Controller
@RequestMapping("/pad/issue")
public class IssueController {
    @Autowired
    IGetwxpropService getwxprop;
    private static Map<String, String> map = new HashMap<>(); // 各区对应页面
    static {
        map.put("a", "apu_edit");
        map.put("t", "t_edit");
        map.put("m", "mach_edit");
    }

    @Autowired
    private IIssueService service;
    @Autowired
    IPrinterService printerService;

    /**
     * 页面跳转
     * @param temp
     * @return
     */
    @RequestMapping(value = "/{temp}", method = RequestMethod.GET)
    public String index(@PathVariable String temp, HttpServletRequest request, Model model) {
        Map<String, String> resultMap = getWxProp(request);
        model.addAttribute("wxJsData", resultMap);
        String tempStr = map.get(temp);
        if (tempStr == null || "".equals(tempStr)) {
            tempStr = "index";
        }
        model.addAttribute("temp", temp);
        return "pad/" + tempStr;
    }

    /**
     * 跳转页面到列表页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(HttpServletRequest request, Model model) {
        // 请求数据
        String temp = request.getParameter("temp"); // 大区 a/t/m
        // 响应数据
        model.addAttribute("temp", temp);
//        model.addAttribute("issueList", service.getIssueList(temp));

        // 获取打印机信息
        Printer printer = printerService.getPrinterInfoByAccount(null);
        model.addAttribute("printer", printer);

        return "pad/list";
    }

    /**
     * 分页查询
     * @param temp
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public List<Issue> listPage(String temp, Integer page, Integer size, String searchText) {
        return service.getIssueListByPage(temp, page, size, searchText);
    }

    /**
     * 查看及修改问题
     * @param model
     * @return
     */
    @RequestMapping(value = "/toEdit",  method = RequestMethod.GET)
    public String toEdit(HttpServletRequest request, Model model) {
        Map<String, String> resultMap = getWxProp(request);
        model.addAttribute("wxJsData", resultMap);
        String temp = request.getParameter("temp").toLowerCase();
        Integer id = Integer.valueOf(request.getParameter("id"));
        String tempStr = map.get(temp);
        Issue issue = service.getIssueById(id);
        // 扩展表
        if(issue.getIssueExtend() != null && !"".equals(issue.getIssueExtend())) {
            model.addAttribute("extend", JSON.parseObject(issue.getIssueExtend()));
        }
        // 操作list
        if (issue.getComments() != null && !"".equals(issue.getComments())) {
            model.addAttribute("dealList", JSON.parseArray(issue.getComments()));
        }

        // 获取打印机信息
        Printer printer = printerService.getPrinterInfoByAccount(null);
        model.addAttribute("printer", printer);
        model.addAttribute("issue", issue);
        model.addAttribute("temp", temp);
        return "pad/" + tempStr;
    }

    /**
     * 添加问题
     * @param issue
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult add(@RequestBody Issue issue) {
        int add = service.add(issue);
        if (add > 0) {
            return JsonResult.success("提交成功", null);
        }
        return JsonResult.failure("提交失败");
    }

    /**
     * 修改
     * @param issue
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult modify(@RequestBody Issue issue) {
        int modify = service.modify(issue);
        if (modify > 0) {
            // T区返回提交成功
            if (issue.getQualityType() != null && "T".equals(issue.getQualityType())) {
                return JsonResult.success("提交成功", null);
            }
            // 其他区返回修改成功
            return JsonResult.success("修改成功", null);
        }
        // T区返回提交失败
        if (issue.getQualityType() != null && "T".equals(issue.getQualityType())) {
            return JsonResult.success("提交失败", null);
        }
        // 其他区返回修改失败
        return JsonResult.failure("修改失败");
    }

    /**
     * 获取图片上传参数
     * @param request
     * @return
     */
    private Map<String, String> getWxProp(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        String param = request.getQueryString();
        if (param != null) {
            url += "?" + param;
        }
        if (url != null && url.contains("#")) {
            url = url.split("#")[0];
        }
        Map<String, String> resultMap = getwxprop.getwxprop(url);
        return resultMap;
    }

    /**
     * 保存
     * @param issue
     * @return
     */
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    @ResponseBody
//    public JsonResult save(@RequestBody Issue issue) {
//        int add = service.save(issue);
//        if (add > 0) {
//            return JsonResult.success("保存成功", null);
//        }
//        return JsonResult.failure("保存失败");
//    }
}
