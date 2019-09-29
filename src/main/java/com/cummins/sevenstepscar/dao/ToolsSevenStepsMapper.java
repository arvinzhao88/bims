package com.cummins.sevenstepscar.dao;

import com.cummins.sevenstepscar.model.ToolsSevenSteps;
import com.cummins.sevenstepscar.model.ToolsSevenStepsCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolsSevenStepsMapper {
    long countByExample(ToolsSevenStepsCriteria example);

    int deleteByExample(ToolsSevenStepsCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolsSevenSteps record);

    int insertSelective(ToolsSevenSteps record);

    List<ToolsSevenSteps> selectByExample(ToolsSevenStepsCriteria example);

    ToolsSevenSteps selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolsSevenSteps record, @Param("example") ToolsSevenStepsCriteria example);

    int updateByExample(@Param("record") ToolsSevenSteps record, @Param("example") ToolsSevenStepsCriteria example);

    int updateByPrimaryKeySelective(ToolsSevenSteps record);

    int updateByPrimaryKey(ToolsSevenSteps record);

    /**
    * @Author : wdxu
    * @Date :11:56 2019/7/9
    * @Description: 责任人登录查询
    */

    ToolsSevenSteps selectSevensteptwo(@Param("params") Map<String, Object> map);
}