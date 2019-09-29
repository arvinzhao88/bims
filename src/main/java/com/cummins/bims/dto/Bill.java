package com.cummins.bims.dto;

import java.io.Serializable;

public class Bill implements Serializable {
    private Integer id;

    private Integer receiptId;

    private String measureNo;

    private String issueId;

    private String issueArea;

    private String tempMeasures;

    private String billName;

    private String billType;

    private String dutyPersonName;

    private String dutyPerson;

    private String isEqr;

    public String getIsEqr() {
        return isEqr;
    }

    public void setIsEqr(String isEqr) {
        this.isEqr = isEqr;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public String getMeasureNo() {
        return measureNo;
    }

    public void setMeasureNo(String measureNo) {
        this.measureNo = measureNo == null ? null : measureNo.trim();
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

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getDutyPersonName() {
        return dutyPersonName;
    }

    public void setDutyPersonName(String dutyPersonName) {
        this.dutyPersonName = dutyPersonName == null ? null : dutyPersonName.trim();
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson == null ? null : dutyPerson.trim();
    }
}