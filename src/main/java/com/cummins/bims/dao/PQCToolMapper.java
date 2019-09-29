package com.cummins.bims.dao;

import com.cummins.bims.dto.PQCTool;
import com.cummins.bims.dto.PQCToolCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PQCToolMapper {
    long countByExample(PQCToolCriteria example);

    int deleteByExample(PQCToolCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PQCTool record);

    int insertSelective(PQCTool record);

    List<PQCTool> selectByExample(PQCToolCriteria example);

    PQCTool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PQCTool record, @Param("example") PQCToolCriteria example);

    int updateByExample(@Param("record") PQCTool record, @Param("example") PQCToolCriteria example);

    int updateByPrimaryKeySelective(PQCTool record);

    int updateByPrimaryKey(PQCTool record);
}