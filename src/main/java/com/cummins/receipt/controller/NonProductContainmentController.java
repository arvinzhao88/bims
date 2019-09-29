package com.cummins.receipt.controller;

import com.cummins.receipt.model.NonconfigContainment;
import com.cummins.receipt.model.NonconfigContainmentSon;
import com.cummins.receipt.service.NonProductContainmentService;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * /**
 *
 * @program: bims
 * @description: 不合格品遏制单
 * @author: wdxu
 * @create: 2019-06-19 18:56
 */
@Controller
@RequestMapping("NonProductContainment")
public class NonProductContainmentController {
    @Autowired
    NonProductContainmentService nonProductContainmentService;

    /**
     * @param
     *
     * @return 查询不合格品遏制单 页面回显
     */
    @RequestMapping("queryNonconformingProductContainmentOrder/{tagId}")
    public String queryNonconformingProductContainmentOrder(Model model, @PathVariable("tagId") Integer tagId) {
        NonconfigContainment nonconfigContainment = nonProductContainmentService.unqualifiedInquiry(tagId);
        model.addAttribute("nonconfigContainment", nonconfigContainment);
        /**
         * 查询 “At Customers' Premises 客户区域（此处IQC不适用）”的数据
         */
        List<NonconfigContainmentSon> customerArea = nonProductContainmentService.queryUnqualifiedCurbList(tagId);
        model.addAttribute("customerArea", customerArea);
        /**
         * 查询 “In BFCEC  BFCEC 区域”的数据
         */
        List<NonconfigContainmentSon> bfcec = nonProductContainmentService.queryTheBfcecArea(tagId);
        model.addAttribute("bfcec", bfcec);
        /**
         * 查询 “At Supplier's Premises 供应商区域”的数据
         */
        List<NonconfigContainmentSon> supplierArea = nonProductContainmentService.querySupplierArea(tagId);
        model.addAttribute("supplierArea", supplierArea);

        return "receipt/bhgpezdupdate";
    }

    /**
     * @param
     *
     * @return 更新不合格品遏制单
     */
    @RequestMapping("queryNonconformingProductContainmentOrder")
    @ResponseBody
    public JsonResult newUnqualifiedProductContainmentOrder(HttpServletRequest request, NonconfigContainment nonconfigContainment) {
        String[] location = request.getParameterValues("location");//区域
        String[] qtty = request.getParameterValues("qtty"); //数量
        String[] screendQtty = request.getParameterValues("screendQtty"); //挑选数量
        String[] nokQtty = request.getParameterValues("nokQtty");//不合格数
        String[] response = request.getParameterValues("response"); //负责人
        String[] verifier = request.getParameterValues("verifier");//确认人
        String[] completionDate = request.getParameterValues("completionDate"); //完成日期
        nonProductContainmentService.updateProductContainmentOrde(nonconfigContainment, location, qtty, screendQtty, nokQtty, response, verifier, completionDate);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 保存不合格品遏制单  --保存之后不可修改
     */
    @RequestMapping("saveTheNonconformingProductContainmentOrder")
    @ResponseBody
    public JsonResult saveTheNonconformingProductContainmentOrder(HttpServletRequest request, NonconfigContainment nonconfigContainment) {
        String[] location = request.getParameterValues("location");//区域
        String[] qtty = request.getParameterValues("qtty"); //数量
        String[] screendQtty = request.getParameterValues("screendQtty"); //挑选数量
        String[] nokQtty = request.getParameterValues("nokQtty");//不合格数
        String[] response = request.getParameterValues("response"); //负责人
        String[] verifier = request.getParameterValues("verifier");//确认人
        String[] completionDate = request.getParameterValues("completionDate"); //完成日期
        nonProductContainmentService.saveTheNonconformingProductContainmentOrder(nonconfigContainment, location, qtty, screendQtty, nokQtty, response, verifier, completionDate);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 删除不合格品遏制单；子表和主表数据
     */
    @RequestMapping("deletePrimarySubtableData/{id}")
    @ResponseBody
    public JsonResult deletePrimarySubtableData(@PathVariable("id") Integer id) {
        nonProductContainmentService.deletePrimarySubtableData(id);
        return JsonResult.success("success");
    }


    /**
     * @param
     *
     * @return 查询不合格品遏制单--不可编辑
     */
    @RequestMapping("notEditable/{tagId}")
    public String notEditable(@PathVariable("tagId") Integer tagId,Model model) {
        NonconfigContainment nonconfigContainment = nonProductContainmentService.unqualifiedInquiry(tagId);
        model.addAttribute("nonconfigContainment", nonconfigContainment);
        /**
         * 查询 “At Customers' Premises 客户区域（此处IQC不适用）”的数据
         */
        List<NonconfigContainmentSon> customerArea = nonProductContainmentService.queryUnqualifiedCurbList(tagId);
        model.addAttribute("customerArea", customerArea);
        /**
         * 查询 “In BFCEC  BFCEC 区域”的数据
         */
        List<NonconfigContainmentSon> bfcec = nonProductContainmentService.queryTheBfcecArea(tagId);
        model.addAttribute("bfcec", bfcec);
        /**
         * 查询 “At Supplier's Premises 供应商区域”的数据
         */
        List<NonconfigContainmentSon> supplierArea = nonProductContainmentService.querySupplierArea(tagId);
        model.addAttribute("supplierArea", supplierArea);
        return "receipt/bhgpezdsubmit";
    }

}