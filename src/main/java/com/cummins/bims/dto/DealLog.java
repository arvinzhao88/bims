package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class DealLog implements Serializable {
    private Integer id;

    private Integer issueId;

    private Integer carId;

    private String remark;

    private String action;

    private String actionName;

    private Date processTime;

    private String processPerson;

    private Integer processPersonId;

    private String processPersonAccount;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    private static final long serialVersionUID = 1L;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getProcessPerson() {
        return processPerson;
    }

    public void setProcessPerson(String processPerson) {
        this.processPerson = processPerson == null ? null : processPerson.trim();
    }

    public Integer getProcessPersonId() {
        return processPersonId;
    }

    public void setProcessPersonId(Integer processPersonId) {
        this.processPersonId = processPersonId;
    }

    public String getProcessPersonAccount() {
        return processPersonAccount;
    }

    public void setProcessPersonAccount(String processPersonAccount) {
        this.processPersonAccount = processPersonAccount == null ? null : processPersonAccount.trim();
    }
}