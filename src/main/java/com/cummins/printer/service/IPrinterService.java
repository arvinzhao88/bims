package com.cummins.printer.service;

import com.cummins.bims.dto.PrintRepairTag;
import com.cummins.model.SearchParam;
import com.cummins.printer.model.Printer;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 打印
 * @author qx
 */
public interface IPrinterService {
    /**
     * 查询绑定的打印机信息
     * @return
     */
    Printer getPrinterInfoByAccount(String account);

    /**
     * 绑定打印机
     * @param account
     * @param printerIp 打印机ip
     * @return
     */
    int bindPrinter(String account, String printerIp);

    /**
     * 打印待处理标签
     * @param issueId
     * @param printerIp
     * @return
     */
    boolean printHoldTag(Integer issueId, String printerIp);

    /**
     * 分页查询
     * @return
     */
    Page<Printer> pageList(SearchParam param);

    /**
     * 查询
     * @return
     */
    List<Printer> getListByAccount(String account);

    /**
     * 删除
     * @param id
     * @return
     */
    int removePrinter(int id);

    /**
     * 打印返修随即卡
     * @param repairTag
     * @return
     */
    boolean printRepairTag(PrintRepairTag repairTag);
}
