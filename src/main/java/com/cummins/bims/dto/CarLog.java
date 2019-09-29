package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class CarLog implements Serializable {
    private Integer id;

    private Integer carId;

    private Integer issueId;

    private Date processTime;

    private String processPerson;

    private String processPersonAccount;

    private String processPersonId;

    private Integer action;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
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

    public String getProcessPersonAccount() {
        return processPersonAccount;
    }

    public void setProcessPersonAccount(String processPersonAccount) {
        this.processPersonAccount = processPersonAccount == null ? null : processPersonAccount.trim();
    }

    public String getProcessPersonId() {
        return processPersonId;
    }

    public void setProcessPersonId(String processPersonId) {
        this.processPersonId = processPersonId == null ? null : processPersonId.trim();
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}