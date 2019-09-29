package com.cummins.util;

import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.SysUser;
import com.cummins.permission.model.BimsPerson;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DealLogUtil {
    public static DealLog getDealLog(String action, BimsPerson person){
        DealLog dealLog = new DealLog();
        dealLog.setAction(action);
        dealLog.setProcessTime(new Date());
        dealLog.setProcessPerson(person.getName());
        dealLog.setProcessPersonId(person.getId());
        dealLog.setProcessPersonAccount(person.getAccount());
        return dealLog;
    }
}
