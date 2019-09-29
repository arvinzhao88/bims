package com.cummins.bims.dao;

import com.cummins.bims.dto.PrintRepairTag;
import com.cummins.bims.dto.PrintRepairTagCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrintRepairTagMapper {
    long countByExample(PrintRepairTagCriteria example);

    int deleteByExample(PrintRepairTagCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrintRepairTag record);

    int insertSelective(PrintRepairTag record);

    List<PrintRepairTag> selectByExample(PrintRepairTagCriteria example);

    PrintRepairTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrintRepairTag record, @Param("example") PrintRepairTagCriteria example);

    int updateByExample(@Param("record") PrintRepairTag record, @Param("example") PrintRepairTagCriteria example);

    int updateByPrimaryKeySelective(PrintRepairTag record);

    int updateByPrimaryKey(PrintRepairTag record);
}