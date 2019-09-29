package com.cummins.bims.service.impl;

import com.cummins.bims.dao.AdviceMapper;
import com.cummins.bims.dto.Advice;
import com.cummins.bims.dto.AdviceCriteria;
import com.cummins.bims.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    private AdviceMapper adviceMapper;

    @Override
    public List<Advice> getListByIssueId(Integer id) {
        AdviceCriteria criteria = new AdviceCriteria();
        criteria.createCriteria().andIssueIdEqualTo(id);
        return adviceMapper.selectByExample(criteria);
    }
}
