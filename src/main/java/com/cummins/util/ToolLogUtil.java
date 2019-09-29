package com.cummins.util;

import com.cummins.bims.dto.DealLog;
import com.cummins.bims.dto.ToolLog;
import com.cummins.permission.model.BimsPerson;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ToolLogUtil {
    public static ToolLog getDealLog(BimsPerson person){
        ToolLog toolLog = new ToolLog();
        toolLog.setProcessTime(new Date());
        toolLog.setProcessPerson(person.getName());
        toolLog.setProcessPersonId(String.valueOf(person.getId()));
        toolLog.setProcessPersonAccount(person.getAccount());
        toolLog.setType(1);//car
        return toolLog;
    }
}
