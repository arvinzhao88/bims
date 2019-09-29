package com.cummins.pad.service;

import com.cummins.bims.dto.Issue;

import java.util.List;

/**
 * pad端
 * @author qixiao
 */
public interface IIssueService {
    /**
     * 添加问题
     * @param issue
     * @return
     */
    int add(Issue issue);

    /**
     * 获取问题列表
     * @param temp 大区 A/T/M
     * @return
     */
    List<Issue> getIssueList(String temp);

    /**
     * 分页查询
     * @param temp
     * @param page
     * @param size
     * @return
     */
    List<Issue> getIssueListByPage(String temp, Integer page, Integer size,String searchText);

    /**
     * 通过id查询问题详情
     * @param id
     * @return
     */
    Issue getIssueById(Integer id);

    /**
     * 修改
     * @param issue
     * @return
     */
    int modify(Issue issue);

    /**
     * 保存
     * @param issue
     * @return
     */
//    int save(Issue issue);

    /**
     * 获取保存问题信息
     * @return
     */
//    List<Issue> getTempIssue(Issue issue);
}
