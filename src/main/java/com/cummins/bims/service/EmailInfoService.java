package com.cummins.bims.service;

import com.cummins.bims.dto.EmailInfo;

import java.util.List;

public interface EmailInfoService {
    int insert(EmailInfo emailInfo);
    int update(EmailInfo emailInfo);
    List<EmailInfo> listByCondition(int status);
}
