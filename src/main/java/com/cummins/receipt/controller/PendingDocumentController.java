package com.cummins.receipt.controller;

import com.cummins.receipt.model.DocumentsToBeProcesses;
import com.cummins.receipt.service.PendingDocumentService;
import com.cummins.util.DateUtil2;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: bims
 * @description: 待处理品单据
 * @author: wdxu
 * @create: 2019-06-18 09:26
 */
@Controller
@RequestMapping("PendingDocument")
public class PendingDocumentController {
    @Autowired
    PendingDocumentService pendingDocumentService;

    /**
     * @param
     *
     * @return 查询待处理品单据 页面回显
     */
    @RequestMapping("queryPendingDocuments/{tagId}")
    public String queryPendingDocuments(Model model, @PathVariable("tagId") Integer tagId) {
        // 查询待处理品单据
        DocumentsToBeProcesses documentsToBeProcesses =
                pendingDocumentService.queryPendingDocuments(tagId);
        int num = Integer.parseInt(new java.text.DecimalFormat("0").format(documentsToBeProcesses.getQuantity()));
        model.addAttribute("num",num);
        model.addAttribute("documentsToBeProcesses", documentsToBeProcesses);
        DateUtil2 dateUtil2 = new DateUtil2();
        model.addAttribute("date", dateUtil2.DateToString(documentsToBeProcesses.getDate()));
        model.addAttribute(
                "createtime2", dateUtil2.DateToString(documentsToBeProcesses.getCreatetime2()));
        return "receipt/dclpdjupdate";
    }

    /**
     * @param
     *
     * @return 更新待处理品单据 status为1 更新
     */
    @RequestMapping(value = "updatePendingDocuments", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult updatePendingDocuments(
            DocumentsToBeProcesses documentsToBeProcesses, HttpServletRequest request) {
        // 更新
        documentsToBeProcesses.setStatue(1);
        pendingDocumentService.updatePendingDocuments(documentsToBeProcesses);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 提交待处理品单据 status为2 提交
     */
    @RequestMapping(value = "submitPendingDocuments", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult submitPendingDocuments(
            DocumentsToBeProcesses documentsToBeProcesses, HttpServletRequest request) {
        // 更新
        documentsToBeProcesses.setStatue(2);
        pendingDocumentService.updatePendingDocuments(documentsToBeProcesses);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 删除待处理品单据
     */
    @RequestMapping("deletePendingDocuments/{tagId}")
    public void deletePendingDocuments(@PathVariable("tagId") Integer tagId) {
        pendingDocumentService.deletePendingDocuments(tagId);
    }

    /**
     * @param
     *
     * @return 查询待处理品单据-只展示
     */
    @RequestMapping("queryPendingProcessingOnlyDisplay/{tagId}")
    public String queryPendingProcessingOnlyDisplay(Model model, @PathVariable("tagId") Integer tagId) {
        DocumentsToBeProcesses documentsToBeProcesses =
                pendingDocumentService.queryOnlySubmit(tagId);
        int num = Integer.parseInt(new java.text.DecimalFormat("0").format(documentsToBeProcesses.getQuantity()));
        model.addAttribute("num",num);
        model.addAttribute("documentsToBeProcesses", documentsToBeProcesses);
        DateUtil2 dateUtil2 = new DateUtil2();
        model.addAttribute("date", dateUtil2.DateToString(documentsToBeProcesses.getDate()));
        model.addAttribute(
                "createtime2", dateUtil2.DateToString(documentsToBeProcesses.getCreatetime2()));

        return "receipt/dclpdjsubmit";
    }
}
