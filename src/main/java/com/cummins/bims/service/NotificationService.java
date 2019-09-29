package com.cummins.bims.service;

import com.cummins.bims.dto.Notification;

public interface NotificationService {
    Integer saveNotification(Notification notification);

    Integer updNotification(Notification notification);

    Notification getNoticeByIssueId(String id);
}
