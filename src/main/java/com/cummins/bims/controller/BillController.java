package com.cummins.bims.controller;

import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dao.MsgPersonMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.enums.RecordStatusEnum;
import com.cummins.bims.service.ApuCheckService;
import com.cummins.bims.service.BillService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.receipt.model.TagstobeProcessed;
import com.cummins.util.DealLogUtil;
import com.cummins.util.JsonResult;
import com.cummins.util.SendMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 单据
 */

@RequestMapping("bill")
@Controller
public class BillController {
    @Autowired
    private BillService billService;

    @Autowired
    private DealLogMapper dealLogMapper;

    @Autowired
    private ApuCheckService apuCheckService;

    @Autowired
    private MsgPersonMapper msgPersonMapper;

    /**
     * 处置措施
     * @param bill
     * @return
     */
    @RequestMapping("getBills")
    @ResponseBody
    public JsonResult getTools(Bill bill){
        List<Bill> tools = billService.getBills(bill);
        return JsonResult.success(tools);
    }

    /**
     * 保存处置措施
     * @param bill
     * @return
     */
    @RequestMapping(value = "saveBill", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveBill(Bill bill, String qDocs, HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        List<Bill> bills = billService.saveBatch(bill, qDocs);
        //ATPU  采购件  通知物流班长和SQI
        Issue issue = apuCheckService.apuDetail(bill.getIssueId());
        //获取物流班长和SQI人员
        List<MsgPerson> msgPersonList = null;
        MsgPersonCriteria criteria = new MsgPersonCriteria();
        if ("64".equals(issue.getPlant())){
            criteria.createCriteria().andTypeEqualTo("F");
            msgPersonList = msgPersonMapper.selectByExample(criteria);
        }else {
            criteria.createCriteria().andTypeEqualTo("X");
            msgPersonList = msgPersonMapper.selectByExample(criteria);
        }

        for (MsgPerson msgPerson: msgPersonList) {
            SendMsg.sendNoticeSQI(issue, msgPerson,bills);
        }
        if (bills.size() > 0){
            //插入处理记录
            DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.ADDRECEIPT.getCode()),person);
            dealLog.setIssueId(Integer.valueOf(bill.getIssueId()));
            dealLogMapper.insert(dealLog);
            return JsonResult.success(bills);
        }
        return JsonResult.failure("操作失败");
    }

    /**
     * 删除处置措施
     * @param bill
     * @return
     */
    @RequestMapping("delBill")
    @ResponseBody
    public JsonResult delBill(Bill bill,HttpServletRequest request){
        //获取用户
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Integer i = billService.del(bill);

        //插入处理记录
        DealLog dealLog = DealLogUtil.getDealLog(String.valueOf(RecordStatusEnum.DELRECEIPT.getCode()),person);
        dealLog.setIssueId(Integer.valueOf(bill.getIssueId()));
        dealLogMapper.insert(dealLog);
        return JsonResult.success(i);
    }

    /**
     * 单据
     * @param
     * @return
     */
    @RequestMapping("getListByBillType")
    @ResponseBody
    public JsonResult getListByBillType(Bill bill){
        List<Bill> list = billService.getListByBillType(bill);
        return JsonResult.success(list);
    }

    /**
     * 动态加载单机便签
     * @param bill
     * @return
     */
    @RequestMapping(value = "getBillTabs", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getBillTabs(Bill bill){
        List<Bill> tools = billService.getBillTabs(bill);
        return JsonResult.success(tools);
    }
}
