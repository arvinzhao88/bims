package com.cummins.pad.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cummins.pad.dao.HoldTagLogDAO;
import com.cummins.pad.model.HoldTagLog;
import com.cummins.pad.service.IHoldTagLogService;
import com.cummins.permission.model.BimsPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 待处理标签打印日志
 */
@Service
public class HoldTagLogServiceImpl implements IHoldTagLogService {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HoldTagLogDAO dao;

    /**
     * 添加日志
     * @param issueId
     * @param printContent
     * @return
     */
    @Override
    public int add(int issueId, JSONObject printContent, int status) {
        if (printContent != null) {
            BimsPerson person = (BimsPerson) request.getSession().getAttribute("wx_person_info");
            HoldTagLog holdTagLog = new HoldTagLog();
            holdTagLog.setIssueId(issueId); // 问题id
            holdTagLog.setPersonId(person.getId()); // 打印人id
            holdTagLog.setPersonAccount(person.getAccount()); // 打印人工号
            holdTagLog.setPrinterIp(printContent.getString("ip")); // 打印机ip
            holdTagLog.setPrintContent(printContent.toString()); // 打印内容json
            holdTagLog.setPrintTime(new Date()); // 打印时间
            holdTagLog.setStatus(status); // 状态
            return dao.insert(holdTagLog);
        }
        return 0;
    }
}
