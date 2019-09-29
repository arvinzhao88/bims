package com.cummins.bims.dao;

import com.cummins.bims.dto.IssueJobReview;
import com.cummins.bims.dto.IssueJobReviewCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssueJobReviewMapper {
    long countByExample(IssueJobReviewCriteria example);

    int deleteByExample(IssueJobReviewCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(IssueJobReview record);

    int insertSelective(IssueJobReview record);

    List<IssueJobReview> selectByExample(IssueJobReviewCriteria example);

    IssueJobReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IssueJobReview record, @Param("example") IssueJobReviewCriteria example);

    int updateByExample(@Param("record") IssueJobReview record, @Param("example") IssueJobReviewCriteria example);

    int updateByPrimaryKeySelective(IssueJobReview record);

    int updateByPrimaryKey(IssueJobReview record);
}