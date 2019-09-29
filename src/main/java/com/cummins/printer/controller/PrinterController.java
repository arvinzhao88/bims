package com.cummins.printer.controller;

import com.cummins.bims.dto.PrintRepairTag;
import com.cummins.model.DatatablesView;
import com.cummins.model.SearchParam;
import com.cummins.printer.model.Printer;
import com.cummins.printer.service.IPrinterService;
import com.cummins.util.JsonResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 打印机
 * @author qx
 */
@Controller
@RequestMapping("/printer")
public class PrinterController {
    @Autowired
    private IPrinterService service;

    /**
     * 查询打印机信息
     * @return
     */
    @RequestMapping(value = "/getPrinterInfoByAccount", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult getPrinterInfoByAccount(String account) {
        Printer printer = service.getPrinterInfoByAccount(account);
        return JsonResult.success(printer);
    }

    /**
     * 绑定打印机
     * @param account
     * @param printerIp 打印机ip
     * @return
     */
    @RequestMapping(value = "/bindPrinter", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult bindPrinter(String account, String printerIp) {
        int save = service.bindPrinter(account, printerIp);
        if (save > 0) {
            return JsonResult.success("绑定成功", null);
        }
        return JsonResult.failure("绑定失败");
    }

    /**
     * 打印待处理标签
     * @param issueId
     * @param printerIp
     * @return
     */
    @RequestMapping(value = "/printHoldTag", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult printHoldTag(Integer issueId, String printerIp) {
        boolean result = service.printHoldTag(issueId, printerIp);
        if (result) {
            return JsonResult.success("打印成功", null);
        }
        return JsonResult.failure("打印失败，请确认打印机是否开机");
    }

    /**
     * 跳转绑定打印机页面
     * @return
     */
    @RequestMapping("/toBindPrinter")
    public String toBindPrinter(Model model, String account) {
        if (account != null && !"".equals(account)) {
            model.addAttribute("account", account);
        }
        return "printer/bind_printer";
    }

    /**
     * 跳转打印机列表页面
     * @return
     */
    @RequestMapping("/toPrinterList")
    public String toPrinterList() {
        return "printer/printer_list";
    }

    /**
     * 分页查询
     * @param param
     * @return
     */
    @RequestMapping("/pageList")
    @ResponseBody
    public DatatablesView<Printer> pageList(SearchParam param) {
        Page<Printer> list = service.pageList(param);
        DatatablesView<Printer> datatablesView = new DatatablesView<>();
        if (list != null) {
            datatablesView.setData(list);
            datatablesView.setRecordsTotal((int) list.getTotal());
            datatablesView.setDraw(param.getPageSize());
        }
        return datatablesView;
    }

    /**
     * 查询列表
     * @param account
     * @return
     */
    @RequestMapping("/getListByAccount")
    @ResponseBody
    public List<Printer> getListByAccount(String account) {
        return service.getListByAccount(account);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/removePrinter", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult removePrinter(int id) {
        int del = service.removePrinter(id);
        if (del > 0) {
            return JsonResult.success("删除成功", null);
        }
        return JsonResult.failure("删除失败");
    }

    /**
     * 打印返工返修随机卡
     * @param
     * @param repairTag
     * @return
     */
    @RequestMapping(value = "/printRepairTag", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult printRepairTag(PrintRepairTag repairTag) {
        boolean result = service.printRepairTag(repairTag);
        if (result) {
            return JsonResult.success("打印成功", null);
        }
        return JsonResult.failure("打印失败，请确认打印机是否开机");
    }
}
