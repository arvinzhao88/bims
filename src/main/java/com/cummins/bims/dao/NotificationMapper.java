package com.cummins.bims.dao;

import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.NotificationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationMapper {
    long countByExample(NotificationCriteria example);

    int deleteByExample(NotificationCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notification record);

    int insertSelective(Notification record);

    List<Notification> selectByExample(NotificationCriteria example);

    Notification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notification record, @Param("example") NotificationCriteria example);

    int updateByExample(@Param("record") Notification record, @Param("example") NotificationCriteria example);

    int updateByPrimaryKeySelective(Notification record);

    int updateByPrimaryKey(Notification record);
}