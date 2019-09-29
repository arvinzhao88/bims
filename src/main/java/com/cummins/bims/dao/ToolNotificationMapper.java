package com.cummins.bims.dao;

import com.cummins.bims.dto.ToolNotification;
import com.cummins.bims.dto.ToolNotificationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolNotificationMapper {
    long countByExample(ToolNotificationCriteria example);

    int deleteByExample(ToolNotificationCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolNotification record);

    int insertSelective(ToolNotification record);

    List<ToolNotification> selectByExample(ToolNotificationCriteria example);

    ToolNotification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolNotification record, @Param("example") ToolNotificationCriteria example);

    int updateByExample(@Param("record") ToolNotification record, @Param("example") ToolNotificationCriteria example);

    int updateByPrimaryKeySelective(ToolNotification record);

    int updateByPrimaryKey(ToolNotification record);
}