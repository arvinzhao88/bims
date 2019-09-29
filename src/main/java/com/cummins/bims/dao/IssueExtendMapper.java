package com.cummins.bims.dao;

import com.cummins.bims.dto.IssueExtend;
import com.cummins.bims.dto.IssueExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueExtendMapper {
    long countByExample(IssueExtendCriteria example);

    int deleteByExample(IssueExtendCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(IssueExtend record);

    int insertSelective(IssueExtend record);

    List<IssueExtend> selectByExample(IssueExtendCriteria example);

    IssueExtend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IssueExtend record, @Param("example") IssueExtendCriteria example);

    int updateByExample(@Param("record") IssueExtend record, @Param("example") IssueExtendCriteria example);

    int updateByPrimaryKeySelective(IssueExtend record);

    int updateByPrimaryKey(IssueExtend record);
}