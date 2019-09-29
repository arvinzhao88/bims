package com.cummins.bims.dao;

import com.cummins.bims.dto.EmailInfo;
import com.cummins.bims.dto.EmailInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailInfoMapper {
    long countByExample(EmailInfoCriteria example);

    int deleteByExample(EmailInfoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmailInfo record);

    int insertSelective(EmailInfo record);

    List<EmailInfo> selectByExample(EmailInfoCriteria example);

    EmailInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmailInfo record, @Param("example") EmailInfoCriteria example);

    int updateByExample(@Param("record") EmailInfo record, @Param("example") EmailInfoCriteria example);

    int updateByPrimaryKeySelective(EmailInfo record);

    int updateByPrimaryKey(EmailInfo record);
}