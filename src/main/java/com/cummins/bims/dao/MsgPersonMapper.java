package com.cummins.bims.dao;

import com.cummins.bims.dto.MsgPerson;
import com.cummins.bims.dto.MsgPersonCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgPersonMapper {
    long countByExample(MsgPersonCriteria example);

    int deleteByExample(MsgPersonCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgPerson record);

    int insertSelective(MsgPerson record);

    List<MsgPerson> selectByExample(MsgPersonCriteria example);

    MsgPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgPerson record, @Param("example") MsgPersonCriteria example);

    int updateByExample(@Param("record") MsgPerson record, @Param("example") MsgPersonCriteria example);

    int updateByPrimaryKeySelective(MsgPerson record);

    int updateByPrimaryKey(MsgPerson record);
}