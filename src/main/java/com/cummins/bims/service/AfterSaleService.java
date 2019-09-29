package com.cummins.bims.service;

import com.cummins.bims.dto.AfterSaleIssue;
import com.cummins.bims.dto.Issue;
import com.cummins.bims.dto.IssueShExt;
import com.cummins.model.SearchParam;
import com.cummins.permission.model.BimsPerson;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :18:04 2019/6/27
 * @Description: 售后问题业务接口
 */
public interface AfterSaleService {
    /**
     * @Author : wdxu
     * @Date :11:13 2019/6/28
     * @Description: 售后数据增加
     */
    void addAfterSaleIssue(AfterSaleIssue afterSaleIssue, Issue issue, BimsPerson person);


    /**
     * @Author : wdxu
     * @Date :14:46 2019/6/28
     * @Description: 售后列表查询
     */
    Page<AfterSaleIssue> getList(SearchParam search);

    /**
     * @Author : wdxu
     * @Date :17:12 2019/6/28
     * @Description: 删除售后数据
     */
    void deleteAfterSalesData(Integer id);


    /**
     * @Author : wdxu
     * @Date :15:20 2019/7/1
     * @Description: 通过id 查询售后数据
     */

    AfterSaleIssue queryAfterSaleById(Integer id);

    AfterSaleIssue selectByIssueId(String id);


    /**
     * @Author : wdxu
     * @Date :16:50 2019/7/1
     * @Description: 更新售后数据
     */
    void updateAfterSalesData(AfterSaleIssue afterSaleIssue);

    List<IssueShExt> getShExt(String id);
}
