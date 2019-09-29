package com.cummins.bims.service.impl;

import com.cummins.bims.dto.EmailInfo;
import com.cummins.bims.service.EmailInfoService;
import com.cummins.email.EmailRequest;
import com.cummins.email.EmailSendUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
@Lazy(false)
public class SaticScheduleTask {
    @Value("${MAIL_SERVER}")
    private String mailServer;

    @Autowired
    private EmailInfoService emailInfoService;

    //3.添加定时任务
    @Scheduled(cron = "0/60 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {

        List<EmailInfo> emaillist = emailInfoService.listByCondition(0);
        for(EmailInfo email: emaillist) {
            EmailInfo emailInfo = new EmailInfo();
            if (email.getToEmail() != null && !"".equals(email.getToEmail())) {
                String result = sendMail(email);
                if (result != null && "success".equals(result)) { // 成功
                    emailInfo.setStatus(1);
                } else { // 失败
                    emailInfo.setStatus(2);
                }
            } else {
                emailInfo.setStatus(2);
            }
            emailInfo.setFromEmail(email.getFromEmail());
            emailInfo.setSendTime(new Date());
            emailInfo.setId(email.getId());
            emailInfoService.update(emailInfo);
        }
//        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

    private String sendMail(EmailInfo emailinfo) {
        EmailRequest email = new EmailRequest();
        email.setFromAddress("CS_Admin@cummins.com");
        email.setContent(emailinfo.getContent());//10.212.0.30 192.168.66.161
        email.setSubject(emailinfo.getTitile());
        email.setReceiveAddresses(emailinfo.getToEmail());
        email.setCopyAddresses(emailinfo.getCcEmail());
        return EmailSendUtil.sendHtmlMail(mailServer, email);
    }
}
