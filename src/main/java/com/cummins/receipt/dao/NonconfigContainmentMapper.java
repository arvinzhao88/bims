package com.cummins.receipt.dao;

import com.cummins.receipt.model.NonconfigContainment;
import com.cummins.receipt.model.NonconfigContainmentCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NonconfigContainmentMapper {
    long countByExample(NonconfigContainmentCriteria example);

    int deleteByExample(NonconfigContainmentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(NonconfigContainment record);

    int insertSelective(NonconfigContainment record);

    List<NonconfigContainment> selectByExample(NonconfigContainmentCriteria example);

    NonconfigContainment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NonconfigContainment record, @Param("example") NonconfigContainmentCriteria example);

    int updateByExample(@Param("record") NonconfigContainment record, @Param("example") NonconfigContainmentCriteria example);

    int updateByPrimaryKeySelective(NonconfigContainment record);

    int updateByPrimaryKey(NonconfigContainment record);
}