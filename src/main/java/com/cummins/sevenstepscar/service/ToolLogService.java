package com.cummins.sevenstepscar.service;

import com.cummins.bims.dto.ToolLog;

import java.util.List;

/**
 * @Author : wdxu
 * @Date :13:38 2019/7/23
 * @Description: 工具日志
 */

public interface ToolLogService {
    void addToolLog(ToolLog toolLog);
    List<ToolLog> getLog(ToolLog toolLog);
}
