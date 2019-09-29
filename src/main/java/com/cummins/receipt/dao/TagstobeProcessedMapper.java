package com.cummins.receipt.dao;

import com.cummins.receipt.model.TagstobeProcessed;
import com.cummins.receipt.model.TagstobeProcessedCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TagstobeProcessedMapper {
    long countByExample(TagstobeProcessedCriteria example);

    int deleteByExample(TagstobeProcessedCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagstobeProcessed record);

    int insertSelective(TagstobeProcessed record);

    List<TagstobeProcessed> selectByExample(TagstobeProcessedCriteria example);

    TagstobeProcessed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagstobeProcessed record, @Param("example") TagstobeProcessedCriteria example);

    int updateByExample(@Param("record") TagstobeProcessed record, @Param("example") TagstobeProcessedCriteria example);

    int updateByPrimaryKeySelective(TagstobeProcessed record);

    int updateByPrimaryKey(TagstobeProcessed record);
}