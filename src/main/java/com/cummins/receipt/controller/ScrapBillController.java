package com.cummins.receipt.controller;

import com.cummins.receipt.model.ScrapTicket;
import com.cummins.receipt.service.ScrapBillService;
import com.cummins.util.DateUtil2;
import com.cummins.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: bims
 * @description: 报废单
 * @author: wdxu 
 * @create: 2019-06-19 13:37
 */
@Controller
@RequestMapping("ScrapBill")
public class ScrapBillController {
    @Autowired
    ScrapBillService scrapBillService;

    /**
     * @param
     * @return 查询报废单 页面回显
     */
    @RequestMapping("queryScrapForUpdate/{tagId}")
    public String queryScrap(Model model, @PathVariable("tagId") Integer tagId) {
        ScrapTicket scrapTicket = scrapBillService.queryScrap(tagId);
        int num = Integer.parseInt(new java.text.DecimalFormat("0").format(scrapTicket.getQuantity()));
        model.addAttribute("num",num);
        model.addAttribute("scrapTicket", scrapTicket);
        DateUtil2 dateUtil2 = new DateUtil2();
        model.addAttribute("date", dateUtil2.DateToString(scrapTicket.getCreatetime()));

        return "receipt/bfdupdate";
    }

    /**
     * @param
     *
     * @return 更新报废单
     */
    @RequestMapping("updateScrap")
    @ResponseBody
    public JsonResult updateScrap(ScrapTicket scrapTicket) {
        //更新
        scrapTicket.setStatue(1);
        scrapBillService.updateScrapById(scrapTicket);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 保存报废单;保存之后不可修改
     */
    @RequestMapping("submitScrap")
    @ResponseBody
    public JsonResult submitScrap(ScrapTicket scrapTicket) {
        scrapTicket.setStatue(2);
        scrapBillService.updateScrapById(scrapTicket);
        return JsonResult.success("success");
    }

    /**
     * @param
     *
     * @return 查询报废单 只展示 状态为2的
     */
    @RequestMapping("queryScrappedOrdersOnlyShow/{tagId}")
    public String queryScrappedOrdersOnlyShow(Model model, @PathVariable("tagId") Integer tagId) {
        ScrapTicket scrapTicket = scrapBillService.queryScrappedOrdersOnlyShow(tagId);
        int num = Integer.parseInt(new java.text.DecimalFormat("0").format(scrapTicket.getQuantity()));
        model.addAttribute("num",num);
        model.addAttribute("scrapTicket", scrapTicket);
        DateUtil2 dateUtil2 = new DateUtil2();
        model.addAttribute("date", dateUtil2.DateToString(scrapTicket.getCreatetime()));
        return "receipt/bfdsubmit";
    }

}
