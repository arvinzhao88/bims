package com.cummins.printer.service.impl;

import com.cummins.bims.dao.IssueMapper;
import com.cummins.bims.dao.PrintRepairTagMapper;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.PrintRepairTag;
import com.cummins.model.SearchParam;
import com.cummins.pad.service.IHoldTagLogService;
import com.cummins.permission.model.BimsPerson;
import com.cummins.printer.dao.PrintdataDAO;
import com.cummins.printer.dao.PrinterDAO;
import com.cummins.printer.model.Printdata;
import com.cummins.printer.model.Printer;
import com.cummins.printer.model.PrinterExample;
import com.cummins.printer.service.IPrinterService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 打印机
 * @author qx
 */
@Service
public class PrinterServiceImpl implements IPrinterService {
//    private static final String PRINT_URL = "http://116.62.125.190:8001/api/kms/savedate"; // 打印
    private static final String PRINT_URL = "http://192.168.3.131:8004/api/kms/savedate"; // 打印

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private PrinterDAO dao;
    @Autowired
    private IssueMapper issueDao;
    @Autowired
    private IHoldTagLogService logService;
    @Autowired
    private PrintdataDAO printdataDAO;
    @Autowired
    private PrintRepairTagMapper repairTagMapper;
    /**
     * 查询绑定的打印机信息
     * @return
     */
    @Override
    public Printer getPrinterInfoByAccount(String account) {
        if (account == null || "".equals(account)) { // 如果account为空，查询当前登录人绑定的打印机
            BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
            if (person != null && person.getAccount() != null && !"".equals(person.getAccount())) {
                account = person.getAccount();
            }
        }
        PrinterExample personPrinterExample = new PrinterExample();
        PrinterExample.Criteria criteria = personPrinterExample.createCriteria();
        criteria.andPersonAccountEqualTo(account);
        criteria.andStatusEqualTo(1);
        List<Printer> list = dao.selectByExample(personPrinterExample);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 绑定打印机
     * @param account
     * @param printerIp 打印机ip
     * @return
     */
    @Override
    public int bindPrinter(String account, String printerIp) {
        if (account != null && !"".equals(account) && printerIp != null && !"".equals(printerIp)) {
            BimsPerson person = (BimsPerson) request.getSession().getAttribute("person"); // 当前登录人
            if (person != null) {
                Printer record = new Printer();
                record.setPersonAccount(account); // 员工工号
                record.setPrinterIp(printerIp); // 打印机ip
                record.setStatus(1); // 状态
                record.setModifyPersonId(person.getId()); // 修改人id
                record.setModifyPersonAccount(person.getAccount()); // 修改人工号
                record.setModifyTime(new Date()); // 修改时间

                Printer printer = getPrinterInfoByAccount(account);
                if (printer == null) { // 新增
                    record.setCreatePersonId(person.getId()); // 创建人id
                    record.setCreatePersonAccount(person.getAccount()); // 创建人工号
                    record.setCreateTime(new Date()); // 创建时间
                    return dao.insertSelective(record);
                } else { // 修改
                    record.setId(printer.getId());
                    return dao.updateByPrimaryKeySelective(record);
                }
            }
        }
        return 0;
    }

    /**
     * 打印待处理标签
     * @param issueId
     * @param printerIp
     * @return
     */
    @Override
    public boolean printHoldTag(Integer issueId, String printerIp) {
        Issue issue = issueDao.getIssueById(issueId);
        if (issue != null) {
//            JSONObject obj = new JSONObject();
//            obj.put("no", issue.getNumber()); // 编号
//            obj.put("data", getFormatDate(issue.getInputTime())); // 日期
//            obj.put("type", issue.getEngineType()); // 机型
//            obj.put("partNo", (issue.getPartNo() == null || "".equals(issue.getPartNo()) ? issue.getEsn() : issue.getPartNo())); // 零件/发动机号
//            obj.put("quantity", issue.getQty()); // 数量
//            obj.put("partName", issue.getPartName()); // 零件名称
//            obj.put("traceability", issue.getSeriesNo()); // 追溯号
//            obj.put("area", issue.getArea()); // 区域
//            obj.put("defectDesc", issue.getIssueDesc()); // 缺陷描述
//            obj.put("requester", issue.getInputPresonName()); // 录入人
//            obj.put("supplierCode", issue.getVendorCode()); // 供应商代码
//            obj.put("supplierName", issue.getVendorName()); // 供应商名称
//            obj.put("ip", printerIp); // 打印机ip
//            System.out.println(obj.toString());
//            JSONObject result = HttpClientUtils.httpPost(PRINT_URL, obj);
//            System.out.println(result);

            // 保存打印内容
            Printdata printdata = new Printdata();
            printdata.setNo(issue.getNumber()); // 编号
            printdata.setData(getFormatDate(issue.getInputTime())); // 日期
            printdata.setType(issue.getEngineType()); // 机型
            printdata.setPartno((issue.getPartNo() == null || "".equals(issue.getPartNo()) ? issue.getEsn() : issue.getPartNo())); // 零件/发动机号
            printdata.setQuantity(issue.getQty() != null ? String.valueOf(issue.getQty()) : ""); // 数量
            printdata.setPartname(issue.getPartName()); // 零件名称
            printdata.setTraceability(issue.getSeriesNo()); // 追溯码
            printdata.setArea(issue.getArea()); // 区域
            printdata.setDefectdesc(issue.getIssueDesc()); // 缺陷描述
            if ("T".equals(issue.getQualityType())){
                printdata.setRemark(issue.getIssueCategoryL2Name()); // 备注
            }else {
                printdata.setRemark(issue.getComments()); // 备注
            }
            printdata.setRequester(issue.getInputPresonName()); // 录入人
            printdata.setSuppliercode(issue.getVendorCode()); // 供应商代码
            printdata.setSuppliername(issue.getVendorName()); // 供应商名称
            printdata.setIp(printerIp); // 打印机ip
            printdata.setStatus(String.valueOf(0)); // 状态
            printdata.setAddtime(new Date());
            int save = printdataDAO.insert(printdata);
            if (save > 0) {
                Printdata sel = null;
                while(sel == null || (sel.getStatus() != null && "0".equals(sel.getStatus()))) {
                    try {
                        Thread.sleep(5000);
                        sel = printdataDAO.getLastPrintDataByIp(printdata);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 状态为1，打印成功
                if (sel != null && sel.getStatus() != null && "1".equals(sel.getStatus())) {
                    return true;
                }
            }

            // 添加日志
//            if ( save > 0 ) {
//                logService.add(issueId, obj, 1);
//                return true;
//            }
//            logService.add(issueId, obj, 0);
        }
        return false;
    }

    /**
     * 分页查询
     * @return
     */
    @Override
    public Page<Printer> pageList(SearchParam param) {
        PageHelper.startPage(param.getPageNo(), param.getPageSize());
        Page<Printer> list = (Page<Printer>) dao.getPrinterList(param);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 查询列表
     * @param account
     * @return
     */
    @Override
    public List<Printer> getListByAccount(String account) {
        SearchParam param = new SearchParam();
        param.setAccount(account);
        return dao.getPrinterList(param);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int removePrinter(int id) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("person");
        Printer printer = new Printer();
        printer.setId(id);
        printer.setStatus(0);
        if (person != null) {
            printer.setModifyPersonId(person.getId());
            printer.setModifyPersonAccount(person.getAccount());
        }
        printer.setModifyTime(new Date());
        return dao.updateByPrimaryKeySelective(printer);
    }

    @Override
    public boolean printRepairTag(PrintRepairTag repairTag) {
        BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
        repairTag.setRepairDate(new Date());
        repairTag.setOperator(person.getName());
        repairTag.setStatus("0");
        Integer i = repairTagMapper.insert(repairTag);
        if (i > 0) {
            // 状态为1，打印成功
            return true;
        }
        return false;
    }

    /**
     * 日期格式化
     * @param date
     * @return
     */
    private String getFormatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        if (date != null) {
            return format.format(date);
        }
        return "";
    }
}
