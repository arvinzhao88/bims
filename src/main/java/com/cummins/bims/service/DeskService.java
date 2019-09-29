package com.cummins.bims.service;

import com.cummins.bims.dto.IssueParam;
import com.cummins.model.SearchParam;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface DeskService {

    List<Map> getIssueAmount(SearchParam searchParam);

//    List<Map> getMyDeskAmount(IssueParam issueParam);

    Map<String,Integer> findBelongArea(String belongArea);

    /**
     * 工作台初始化数据
     * @return
     */
    Map<String, Object> deskInit(SearchParam searchParam);

    /**
     * 查询待办或已办列表
     * @param param
     * @return
     */
    Page<IssueParam> getDeskListByStatus(SearchParam param);

    /**
     * 查询的各区待办列表
     * @param search
     * @return
     */
    Page<IssueParam> getUnListByArea(SearchParam search);
}
