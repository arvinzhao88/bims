package com.cummins.bims.service;

import com.cummins.bims.dto.Car;
import com.cummins.bims.dto.Notification;
import com.cummins.bims.dto.ToolNotification;
import com.cummins.permission.model.BimsPerson;

public interface SendEmailService {
    Integer insertToolNotification(ToolNotification toolNotification, BimsPerson person);

    Integer sendEQR(Notification notification, BimsPerson person);

    Integer sendCAR(Car car, BimsPerson person);

    /**
     * @param fromEmail 发件人邮箱
     * @param toEmails 收件人邮箱
     * @param title 标题
     * @param content 内容
     * @return
     */
    boolean sendEmail(String fromEmail, String toEmails, String title, String content);
}
