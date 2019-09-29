package com.cummins.bims.service;

import com.cummins.bims.dto.Advice;

import java.util.List;

public interface AdviceService {
    List<Advice> getListByIssueId(Integer id);
}
