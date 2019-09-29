package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class PrintRepairTag implements Serializable {
    private Integer id;

    private String issueNo;

    private String issueDesc;

    private String esn;

    private String so;

    private String tc;

    private String pallet;

    private String repairAction;

    private String operator;

    private Date repairDate;

    private String meQuality;

    private String ip;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo == null ? null : issueNo.trim();
    }

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc == null ? null : issueDesc.trim();
    }

    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn == null ? null : esn.trim();
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so == null ? null : so.trim();
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc == null ? null : tc.trim();
    }

    public String getPallet() {
        return pallet;
    }

    public void setPallet(String pallet) {
        this.pallet = pallet == null ? null : pallet.trim();
    }

    public String getRepairAction() {
        return repairAction;
    }

    public void setRepairAction(String repairAction) {
        this.repairAction = repairAction == null ? null : repairAction.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getMeQuality() {
        return meQuality;
    }

    public void setMeQuality(String meQuality) {
        this.meQuality = meQuality == null ? null : meQuality.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}