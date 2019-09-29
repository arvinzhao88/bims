package com.cummins.bims.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DealToolPerson implements Serializable {
    private Integer id;

    private String toolNo;

    private Integer issueId;

    private String issueArea;

    private String processPersonName;

    private String processPersonAccount;

    private String reviewPersonAccount;

    private String reviewPersonName;

    private Integer processPersonId;

    private String initPersonName;

    private String intPersonAccount;

    private Byte status;

    private Byte type;

    private Byte toolType;

    private String toolName;

    private Date createTime;

    private Date needOverTime;

    private Date dealTime;

    private String back1;

    private String back2;

    private String back3;

    private String pathUrl;

    /** 待办标识 0.待办 1.已办**/
    private Integer toDoStatus = 1;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToolNo() {
        return toolNo;
    }

    public void setToolNo(String toolNo) {
        this.toolNo = toolNo == null ? null : toolNo.trim();
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getIssueArea() {
        return issueArea;
    }

    public void setIssueArea(String issueArea) {
        this.issueArea = issueArea == null ? null : issueArea.trim();
    }

    public String getProcessPersonName() {
        return processPersonName;
    }

    public void setProcessPersonName(String processPersonName) {
        this.processPersonName = processPersonName == null ? null : processPersonName.trim();
    }

    public String getProcessPersonAccount() {
        return processPersonAccount;
    }

    public void setProcessPersonAccount(String processPersonAccount) {
        this.processPersonAccount = processPersonAccount == null ? null : processPersonAccount.trim();
    }

    public Integer getProcessPersonId() {
        return processPersonId;
    }

    public void setProcessPersonId(Integer processPersonId) {
        this.processPersonId = processPersonId;
    }

    public String getInitPersonName() {
        return initPersonName;
    }

    public void setInitPersonName(String initPersonName) {
        this.initPersonName = initPersonName == null ? null : initPersonName.trim();
    }

    public String getIntPersonAccount() {
        return intPersonAccount;
    }

    public void setIntPersonAccount(String intPersonAccount) {
        this.intPersonAccount = intPersonAccount == null ? null : intPersonAccount.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getToolType() {
        return toolType;
    }

    public void setToolType(Byte toolType) {
        this.toolType = toolType;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName == null ? null : toolName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getNeedOverTime() {
        return needOverTime;
    }

    public void setNeedOverTime(Date needOverTime) {
        this.needOverTime = needOverTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1 == null ? null : back1.trim();
    }

    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2 == null ? null : back2.trim();
    }

    public String getBack3() {
        return back3;
    }

    public void setBack3(String back3) {
        this.back3 = back3 == null ? null : back3.trim();
    }

    public String getReviewPersonAccount() {
        return reviewPersonAccount;
    }

    public void setReviewPersonAccount(String reviewPersonAccount) {
        this.reviewPersonAccount = reviewPersonAccount;
    }

    public String getReviewPersonName() {
        return reviewPersonName;
    }

    public void setReviewPersonName(String reviewPersonName) {
        this.reviewPersonName = reviewPersonName;
    }

    public String getPathUrl() {
        return pathUrl;
    }

    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl;
    }

    public Integer getToDoStatus() {
        return toDoStatus;
    }

    public void setToDoStatus(Integer toDoStatus) {
        this.toDoStatus = toDoStatus;
    }
}