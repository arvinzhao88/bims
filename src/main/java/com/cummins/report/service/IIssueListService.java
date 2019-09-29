package com.cummins.report.service;

import com.cummins.bims.dto.IssueParam;
import com.cummins.model.SearchParam;
import com.github.pagehelper.Page;

/**
 * 问题列表
 * @author qx
 */
public interface IIssueListService {
    /**
     * 查询所有问题列表
     * @param param
     * @return
     */
    Page<IssueParam> getAllIssueList(SearchParam param);
}
