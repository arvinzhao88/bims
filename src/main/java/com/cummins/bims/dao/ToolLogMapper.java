package com.cummins.bims.dao;

import com.cummins.bims.dto.ToolLog;
import com.cummins.bims.dto.ToolLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolLogMapper {
    long countByExample(ToolLogCriteria example);

    int deleteByExample(ToolLogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolLog record);

    int insertSelective(ToolLog record);

    List<ToolLog> selectByExample(ToolLogCriteria example);

    ToolLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolLog record, @Param("example") ToolLogCriteria example);

    int updateByExample(@Param("record") ToolLog record, @Param("example") ToolLogCriteria example);

    int updateByPrimaryKeySelective(ToolLog record);

    int updateByPrimaryKey(ToolLog record);
}