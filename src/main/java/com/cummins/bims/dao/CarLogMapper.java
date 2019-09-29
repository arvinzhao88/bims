package com.cummins.bims.dao;

import com.cummins.bims.dto.CarLog;
import com.cummins.bims.dto.CarLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarLogMapper {
    long countByExample(CarLogCriteria example);

    int deleteByExample(CarLogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarLog record);

    int insertSelective(CarLog record);

    List<CarLog> selectByExample(CarLogCriteria example);

    CarLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarLog record, @Param("example") CarLogCriteria example);

    int updateByExample(@Param("record") CarLog record, @Param("example") CarLogCriteria example);

    int updateByPrimaryKeySelective(CarLog record);

    int updateByPrimaryKey(CarLog record);
}