package com.cummins.bims.service;

import com.cummins.bims.dto.*;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface ApuCheckService {
    /**
     * 分页列表
     * @return
     */
    Page<IssueParam> getList(SearchParam search);
    Page<IssueParam> getList1(SearchParam search);

    IssueExtend getIssueExtend(Issue issue);

    Integer apuAdd(Issue issue,BimsPerson person);

    Integer apudel(Issue issue);

    Issue apuDetail(String id);

    Map getIssueInfo(String id);

    Integer apuCorrect(Issue issue, BimsPerson person);

    Integer isEqr(Bill bill, BimsPerson person);

    /**
     * 决定谁来处理
     * @param bill
     * @param eqrLeader
     * @param person
     * @return
     */
    Integer isEqrTrue(Bill bill, String eqrLeader, BimsPerson person);

    Integer dealtool(DealTool dealTool, BimsPerson person);

    Integer receive(Issue issue,BimsPerson person);

    Integer reject(Issue issue,BimsPerson person);

    Integer closeIssue(Issue issue,BimsPerson person);

    Integer sendAdvice(Issue issue, BimsPerson person);

    /**
    * @Author : wdxu
    * @Date :14:06 2019/7/8
    * @Description: 插入日志
    */
   void addDealLog(DealLog dealLog);
}
