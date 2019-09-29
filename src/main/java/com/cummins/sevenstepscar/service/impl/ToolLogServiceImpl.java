package com.cummins.sevenstepscar.service.impl;

import com.cummins.bims.dao.ToolLogMapper;
import com.cummins.bims.dto.ToolLog;
import com.cummins.bims.dto.ToolLogCriteria;
import com.cummins.sevenstepscar.service.ToolLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**

/**
 *@program: bims
 *@description:
 *@author: wdxu
 *@create: 2019-07-23 13:47
 */
@Service
public class ToolLogServiceImpl implements ToolLogService {

    @Autowired
    ToolLogMapper toolLogMapper;
    /**
    * @Author : wdxu
    * @Date :13:50 2019/7/23
    * @Description: 增加工具日志
    */
    @Override
   public void addToolLog(ToolLog toolLog){
        toolLogMapper.insert(toolLog);
    }

    /**
     * 工具日志
     * @param toolLog
     * @return
     */
    @Override
    public List<ToolLog> getLog(ToolLog toolLog) {
        ToolLogCriteria example = new ToolLogCriteria();
        ToolLogCriteria.Criteria criteria = example.createCriteria();
        criteria.andToolIdEqualTo(toolLog.getToolId());
        criteria.andTypeEqualTo(toolLog.getType());
        List<ToolLog> logs = toolLogMapper.selectByExample(example);
        return logs;
    }

}