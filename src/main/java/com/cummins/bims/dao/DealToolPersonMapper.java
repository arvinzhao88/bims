package com.cummins.bims.dao;

import com.cummins.bims.dto.DealTool;
import com.cummins.bims.dto.DealToolPerson;
import com.cummins.bims.dto.DealToolPersonCriteria;
import java.util.List;
import java.util.Map;

import com.cummins.bims.dto.IssueParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DealToolPersonMapper {
    long countByExample(DealToolPersonCriteria example);

    int deleteByExample(DealToolPersonCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealToolPerson record);

    int insertSelective(DealToolPerson record);

    List<DealToolPerson> selectByExample(DealToolPersonCriteria example);

    DealToolPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealToolPerson record, @Param("example") DealToolPersonCriteria example);

    int updateByExample(@Param("record") DealToolPerson record, @Param("example") DealToolPersonCriteria example);

    int updateByPrimaryKeySelective(DealToolPerson record);

    int updateByPrimaryKey(DealToolPerson record);

    int insertBatch(List<DealToolPerson> dealTools);

    List<DealToolPerson> getToolTabs(@Param("record") DealToolPerson record);
    /**
    * @Author : wdxu
    * @Date :10:52 2019/7/9
    * @Description: 更新工具/人状态
    */
    void updateToolsPersonType(@Param("params") Map<String, Object> map);

    List<DealToolPerson> selectByIssueId(@Param("list") List<Integer> list);

    List<DealToolPerson> getDTByIssueId(@Param("record") DealToolPerson record);
}