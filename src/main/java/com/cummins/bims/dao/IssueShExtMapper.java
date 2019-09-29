package com.cummins.bims.dao;

import com.cummins.bims.dto.IssueShExt;
import com.cummins.bims.dto.IssueShExtCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssueShExtMapper {
    long countByExample(IssueShExtCriteria example);

    int deleteByExample(IssueShExtCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(IssueShExt record);

    int insertSelective(IssueShExt record);

    List<IssueShExt> selectByExample(IssueShExtCriteria example);

    IssueShExt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IssueShExt record, @Param("example") IssueShExtCriteria example);

    int updateByExample(@Param("record") IssueShExt record, @Param("example") IssueShExtCriteria example);

    int updateByPrimaryKeySelective(IssueShExt record);

    int updateByPrimaryKey(IssueShExt record);
}