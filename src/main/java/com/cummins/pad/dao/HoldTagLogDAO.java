package com.cummins.pad.dao;

import com.cummins.pad.model.HoldTagLog;
import com.cummins.pad.model.HoldTagLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HoldTagLogDAO {
    long countByExample(HoldTagLogExample example);

    int deleteByExample(HoldTagLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoldTagLog record);

    int insertSelective(HoldTagLog record);

    List<HoldTagLog> selectByExample(HoldTagLogExample example);

    HoldTagLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoldTagLog record, @Param("example") HoldTagLogExample example);

    int updateByExample(@Param("record") HoldTagLog record, @Param("example") HoldTagLogExample example);

    int updateByPrimaryKeySelective(HoldTagLog record);

    int updateByPrimaryKey(HoldTagLog record);
}