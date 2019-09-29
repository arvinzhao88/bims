package com.cummins.bims.service;

import com.cummins.bims.dto.DealTool;
import com.cummins.bims.dto.DealToolPerson;
import com.cummins.permission.model.BimsPerson;

import java.util.List;

public interface DealToolPersonService {

    /**
     * 批量新增
     * @param jsonArr
     * @return
     */
    List<DealToolPerson> addToolBatch(String jsonArr, BimsPerson person);

    Integer delTool(DealToolPerson dealTool);

    List<DealToolPerson> getToolTabs(DealToolPerson dealTool,BimsPerson person);

    List<DealToolPerson> getTools(DealToolPerson dealTool);

    List<DealToolPerson> selectList(DealToolPerson dealTool);

    DealToolPerson selectByIssueId(Integer id);

    DealToolPerson getDealToolPerson(DealToolPerson dealTool,BimsPerson person);

    DealToolPerson selectByToolId(DealToolPerson dealTool);

    DealToolPerson selectNextPerson(DealToolPerson dealTool);

    Boolean getStatus(Integer id);

}
