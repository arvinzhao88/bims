package com.cummins.pad.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 待处理标签打印日志
 * @author qx
 */
public interface IHoldTagLogService {
    /**
     * 添加日志
     * @param issueId
     * @param printContent
     * @return
     */
    int add(int issueId, JSONObject printContent, int status);
}
