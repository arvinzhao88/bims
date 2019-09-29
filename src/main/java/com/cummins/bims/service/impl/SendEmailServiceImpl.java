package com.cummins.bims.service.impl;

import com.cummins.bims.dao.DealToolPersonMapper;
import com.cummins.bims.dao.EmailInfoMapper;
import com.cummins.bims.dao.ToolNotificationMapper;
import com.cummins.bims.dto.*;
import com.cummins.bims.service.SendEmailService;
import com.cummins.contact.dao.PersonMapper;
import com.cummins.contact.dto.Person;
import com.cummins.contact.dto.PersonCriteria;
import com.cummins.permission.model.BimsPerson;
import com.cummins.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class SendEmailServiceImpl implements SendEmailService {
    private static final String PATH = "<br><br><br><a href='http://192.168.158.81:8080/back/login'>点击此处进入BIMS系统<a>";

    @Autowired
    private ToolNotificationMapper toolNotificationMapper;

    @Autowired
    private EmailInfoMapper emailInfoMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private DealToolPersonMapper dealToolPersonMapper;

    @Override
    @Transactional
    public Integer insertToolNotification(ToolNotification toolNotification, BimsPerson person) {
        String[] emails = toolNotification.getBack1().split(",");
        toolNotification.setPostUser(person.getAccount());
        toolNotification.setStatus(Byte.valueOf("1"));
        toolNotification.setCreateTime(new Date());
        toolNotification.setSendTime(new Date());

        for (String email:emails) {
            EmailInfo emailInfo = new EmailInfo();
            emailInfo.setFromEmail(person.getEmail());
            emailInfo.setTitile("Notification");
            emailInfo.setContent(toolNotification.getMailContent() + SendEmailServiceImpl.PATH);
            emailInfo.setCreateTime(new Date());
            emailInfo.setSendTime(new Date());
            emailInfo.setToEmail(email);
            emailInfo.setStatus(0);
            emailInfoMapper.insertSelective(emailInfo);
        }
        int res = toolNotificationMapper.updateByPrimaryKeySelective(toolNotification);
        DealToolPersonCriteria dealToolPersonCriteria = new DealToolPersonCriteria();
        DealToolPersonCriteria.Criteria query = dealToolPersonCriteria.createCriteria();
        query.andToolNoEqualTo(String.valueOf(toolNotification.getId()));

        DealToolPerson dealToolPerson = new DealToolPerson();
        dealToolPerson.setStatus((byte) 4);
        int i = dealToolPersonMapper.updateByExampleSelective(dealToolPerson, dealToolPersonCriteria);
        return i;
    }

    @Override
    public Integer sendEQR(Notification notification, BimsPerson person) {
        String emails = notification.getEmailNos();
        if (emails != null) {
            emails = emails.replace(",", ";");
        }
        EmailInfo emailInfo = new EmailInfo();
        emailInfo.setFromEmail(person.getEmail());
        emailInfo.setTitile("突发质量问题通知单EQR Notification Form");
        emailInfo.setContent(notification.getMailContent() + SendEmailServiceImpl.PATH);
        emailInfo.setCreateTime(new Date());
        emailInfo.setSendTime(new Date());
        emailInfo.setToEmail(emails);
        emailInfo.setStatus(0);
        emailInfoMapper.insertSelective(emailInfo);
        return 0;
    }

    @Override
    public Integer sendCAR(Car car, BimsPerson person) {
        if (car.getEmailNos() != null) {
            String emails = car.getEmailNos().replace(",", ";");
            EmailInfo emailInfo = new EmailInfo();
            emailInfo.setFromEmail(person.getEmail());
            emailInfo.setTitile("开car提示");
            emailInfo.setContent(car.getMailContent() + SendEmailServiceImpl.PATH);
            emailInfo.setCreateTime(new Date());
            emailInfo.setSendTime(new Date());
            emailInfo.setToEmail(emails);
            emailInfo.setStatus(0);
            return emailInfoMapper.insertSelective(emailInfo);
        }
        return 0;
    }

    /**
     * 多人
     * @param fromEmail 发件人邮箱
     * @param toEmails 收件人邮箱，分号分割
     * @param title 标题
     * @param content 内容
     * @return
     */
    public boolean sendEmail(String fromEmail, String toEmails, String title, String content) {
        boolean result = false;
        EmailInfo emailInfo = new EmailInfo();
        emailInfo.setFromEmail(fromEmail);
        emailInfo.setTitile(title);
        emailInfo.setContent(content + SendEmailServiceImpl.PATH);
        emailInfo.setCreateTime(new Date());
        emailInfo.setSendTime(new Date());
        emailInfo.setToEmail(toEmails);
        emailInfo.setStatus(0);
        Integer i = emailInfoMapper.insertSelective(emailInfo);
        if (i>0){
            result = true;
        }
        return result;
    }
}
