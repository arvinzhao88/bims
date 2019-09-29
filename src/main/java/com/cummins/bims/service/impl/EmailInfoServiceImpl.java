package com.cummins.bims.service.impl;

import com.cummins.bims.dao.EmailInfoMapper;
import com.cummins.bims.dto.EmailInfo;
import com.cummins.bims.dto.EmailInfoCriteria;
import com.cummins.bims.service.EmailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailInfoServiceImpl implements EmailInfoService {
    @Autowired
    private EmailInfoMapper emailInfoMapper;

    @Override
    public int insert(EmailInfo emailInfo) {
        return emailInfoMapper.insertSelective(emailInfo);
    }

    @Override
    public int update(EmailInfo emailInfo) {
        return emailInfoMapper.updateByPrimaryKeySelective(emailInfo);
    }

    public List<EmailInfo> listByCondition(int status) {
        // TODO Auto-generated method stub
        EmailInfoCriteria query=new EmailInfoCriteria();
        EmailInfoCriteria.Criteria temp = query.createCriteria();
        if(status!=-1){
            temp.andStatusEqualTo(status);
        }
        query.setOrderByClause(" id asc");
        return emailInfoMapper.selectByExample(query);
    }

}
