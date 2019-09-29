package com.cummins.receipt.dao;

import com.cummins.receipt.model.NonconfigContainmentSon;
import com.cummins.receipt.model.NonconfigContainmentSonCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NonconfigContainmentSonMapper {
    long countByExample(NonconfigContainmentSonCriteria example);

    int deleteByExample(NonconfigContainmentSonCriteria example);

    int insert(NonconfigContainmentSon record);

    int insertSelective(NonconfigContainmentSon record);

    List<NonconfigContainmentSon> selectByExample(NonconfigContainmentSonCriteria example);

    int updateByExampleSelective(@Param("record") NonconfigContainmentSon record, @Param("example") NonconfigContainmentSonCriteria example);

    int updateByExample(@Param("record") NonconfigContainmentSon record, @Param("example") NonconfigContainmentSonCriteria example);

    void deleteByQuestionId(Integer id);
}