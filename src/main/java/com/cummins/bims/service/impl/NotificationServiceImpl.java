package com.cummins.bims.service.impl;

import com.cummins.bims.dao.NotificationMapper;
import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.NotificationCriteria;
import com.cummins.bims.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationMapper notificationMapper;

    public Integer saveNotification(Notification notification){
        return notificationMapper.insert(notification);
    }

    @Override
    public Integer updNotification(Notification notification) {
        NotificationCriteria criteria = new NotificationCriteria();
        return notificationMapper.updateByExampleSelective(notification,criteria);
    }

    @Override
    public Notification getNoticeByIssueId(String id) {
        NotificationCriteria criteria = new NotificationCriteria();
        NotificationCriteria.Criteria query = criteria.createCriteria();
        query.andIssueIdEqualTo(Integer.valueOf(id));
        List<Notification> notifications = notificationMapper.selectByExample(criteria);
        if (notifications.size()>0){
            return notifications.get(0);
        }else {
            return new Notification();
        }
    }
}
