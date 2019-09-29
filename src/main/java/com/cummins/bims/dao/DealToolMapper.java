package com.cummins.bims.dao;

import com.cummins.bims.dto.DealTool;
import com.cummins.bims.dto.DealToolCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DealToolMapper {
    long countByExample(DealToolCriteria example);

    int deleteByExample(DealToolCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealTool record);

    int insertBatch(List<DealTool> dealTools);

    int insertSelective(DealTool record);

    List<DealTool> selectByExample(DealToolCriteria example);

    DealTool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealTool record, @Param("example") DealToolCriteria example);

    int updateByExample(@Param("record") DealTool record, @Param("example") DealToolCriteria example);

    int updateByPrimaryKeySelective(DealTool record);

    int updateByPrimaryKey(DealTool record);

    List<DealTool> getToolTabs(@Param("record") DealTool record);

    List<DealTool> selectByIssueId(@Param("record") DealTool record);
}