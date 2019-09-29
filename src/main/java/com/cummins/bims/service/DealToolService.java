package com.cummins.bims.service;

import com.cummins.bims.dto.Car;
import com.cummins.bims.dto.DealTool;
import com.cummins.permission.model.BimsPerson;

import java.util.List;

public interface DealToolService {
    List<DealTool> getTools(DealTool dealTool);

    List<Car> getListByToolType(DealTool dealTool);

    DealTool addTool(DealTool dealTool, BimsPerson person);

    /**
     * 批量新增 弃用
     * @param jsonArr
     * @return
     */
    List<DealTool> addToolBatch(String jsonArr, BimsPerson person);

    Integer delTool(DealTool dealTool);

    List<DealTool> getToolTabs(DealTool dealTool);


}
