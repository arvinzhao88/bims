package com.cummins.bims.dao;

import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.DealLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DealLogMapper {
    long countByExample(DealLogCriteria example);

    int deleteByExample(DealLogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealLog record);

    int insertSelective(DealLog record);

    List<DealLog> selectByExample(DealLogCriteria example);

    DealLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealLog record, @Param("example") DealLogCriteria example);

    int updateByExample(@Param("record") DealLog record, @Param("example") DealLogCriteria example);

    int updateByPrimaryKeySelective(DealLog record);

    int updateByPrimaryKey(DealLog record);
}