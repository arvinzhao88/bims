package com.cummins.bims.dao;

import com.cummins.bims.dto.Bill;
import com.cummins.bims.dto.BillCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillMapper {
    long countByExample(BillCriteria example);

    int deleteByExample(BillCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillCriteria example);

    Bill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillCriteria example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillCriteria example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    int updateByIssueId(@Param("record")Bill bill);

    List<Bill> getBillTabs(@Param("record")Bill bill);

    /**
     * 批量保存
     */
    int saveBatch(List<Bill> bills);

    String selectMaxBillNo(@Param("number") String number);

    List<Bill>  selectByIssueId(@Param("issueId") String issueId);
}