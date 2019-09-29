package com.cummins.bims.dao;

import com.cummins.bims.dto.AfterSaleIssue;
import com.cummins.bims.dto.AfterSaleIssueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleIssueMapper {
    long countByExample(AfterSaleIssueCriteria example);

    int deleteByExample(AfterSaleIssueCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSaleIssue record);

    int insertSelective(AfterSaleIssue record);

    List<AfterSaleIssue> selectByExample(AfterSaleIssueCriteria example);

    AfterSaleIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AfterSaleIssue record, @Param("example") AfterSaleIssueCriteria example);

    int updateByExample(@Param("record") AfterSaleIssue record, @Param("example") AfterSaleIssueCriteria example);

    int updateByPrimaryKeySelective(AfterSaleIssue record);

    int updateByPrimaryKey(AfterSaleIssue record);

    AfterSaleIssue selectByIssueId(String id);
}