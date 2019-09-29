package com.cummins.bims.dao;

import com.cummins.bims.dto.CarExtend;
import com.cummins.bims.dto.CarExtendCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarExtendMapper {
    long countByExample(CarExtendCriteria example);

    int deleteByExample(CarExtendCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarExtend record);

    int insertSelective(CarExtend record);

    List<CarExtend> selectByExample(CarExtendCriteria example);

    CarExtend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarExtend record, @Param("example") CarExtendCriteria example);

    int updateByExample(@Param("record") CarExtend record, @Param("example") CarExtendCriteria example);

    int updateByPrimaryKeySelective(CarExtend record);

    int updateByPrimaryKey(CarExtend record);
}