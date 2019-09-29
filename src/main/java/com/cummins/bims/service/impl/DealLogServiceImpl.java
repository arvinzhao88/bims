package com.cummins.bims.service.impl;

import com.cummins.bims.dao.DealLogMapper;
import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.DealLogCriteria;
import com.cummins.bims.service.DealLogService;
import com.cummins.bims.enums.RecordStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealLogServiceImpl implements DealLogService {
    @Autowired
    private DealLogMapper dealLogMapper;

    @Override
    public List<DealLog> getLog(DealLog dealLog) {
        DealLogCriteria example = new DealLogCriteria();
        DealLogCriteria.Criteria criteria = example.createCriteria();
        criteria.andIssueIdEqualTo(dealLog.getIssueId());
        List<DealLog> logs = dealLogMapper.selectByExample(example);
        for (DealLog deal:logs) {
            deal.setActionName(RecordStatusEnum.getNameByCode(Integer.valueOf(deal.getAction())));
        }
        return logs;
    }
}
