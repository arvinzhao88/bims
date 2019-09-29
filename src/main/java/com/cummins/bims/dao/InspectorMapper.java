package com.cummins.bims.dao;

import com.cummins.bims.dto.Inspector;
import com.cummins.bims.dto.InspectorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectorMapper {
    long countByExample(InspectorCriteria example);

    int deleteByExample(InspectorCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inspector record);

    int insertSelective(Inspector record);

    List<Inspector> selectByExample(InspectorCriteria example);

    Inspector selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inspector record, @Param("example") InspectorCriteria example);

    int updateByExample(@Param("record") Inspector record, @Param("example") InspectorCriteria example);

    int updateByPrimaryKeySelective(Inspector record);

    int updateByPrimaryKey(Inspector record);
}