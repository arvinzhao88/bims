package com.cummins.bims.dao;

import com.cummins.bims.dto.BillManage;
import com.cummins.bims.dto.BillManageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillManageMapper {
    long countByExample(BillManageCriteria example);

    int deleteByExample(BillManageCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BillManage record);

    int insertSelective(BillManage record);

    List<BillManage> selectByExample(BillManageCriteria example);

    BillManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillManage record, @Param("example") BillManageCriteria example);

    int updateByExample(@Param("record") BillManage record, @Param("example") BillManageCriteria example);

    int updateByPrimaryKeySelective(BillManage record);

    int updateByPrimaryKey(BillManage record);
}