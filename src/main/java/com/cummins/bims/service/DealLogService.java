package com.cummins.bims.service;

import com.cummins.bims.dto.DealLog;

import java.util.List;

public interface DealLogService {
    List<DealLog> getLog(DealLog dealLog);
}
