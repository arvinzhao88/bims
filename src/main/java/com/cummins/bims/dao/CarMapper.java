package com.cummins.bims.dao;

import com.cummins.bims.dto.Car;
import com.cummins.bims.dto.CarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMapper {
    long countByExample(CarCriteria example);

    int deleteByExample(CarCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarCriteria example);

    Car selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarCriteria example);

    int updateByExample(@Param("record") Car record, @Param("example") CarCriteria example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    String selectMaxCarNo(@Param("number") String number);
}