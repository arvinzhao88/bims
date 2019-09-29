package com.cummins.bims.dao;

import com.cummins.bims.dto.Advice;
import com.cummins.bims.dto.AdviceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceMapper {
    long countByExample(AdviceCriteria example);

    int deleteByExample(AdviceCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advice record);

    int insertSelective(Advice record);

    List<Advice> selectByExample(AdviceCriteria example);

    Advice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advice record, @Param("example") AdviceCriteria example);

    int updateByExample(@Param("record") Advice record, @Param("example") AdviceCriteria example);

    int updateByPrimaryKeySelective(Advice record);

    int updateByPrimaryKey(Advice record);
}