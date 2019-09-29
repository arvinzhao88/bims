package com.cummins.bims.dto;

import java.io.Serializable;

public class BillManage implements Serializable {
    private Integer id;

    private String issueId;

    private String issueArea;

    private String tempMeasures;

    private String billName;

    private String dutyPerson;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId == null ? null : issueId.trim();
    }

    public String getIssueArea() {
        return issueArea;
    }

    public void setIssueArea(String issueArea) {
        this.issueArea = issueArea == null ? null : issueArea.trim();
    }

    public String getTempMeasures() {
        return tempMeasures;
    }

    public void setTempMeasures(String tempMeasures) {
        this.tempMeasures = tempMeasures == null ? null : tempMeasures.trim();
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName == null ? null : billName.trim();
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson == null ? null : dutyPerson.trim();
    }
}