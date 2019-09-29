package com.cummins.bims.dto;

import java.io.Serializable;

public class DealTool implements Serializable {
    private Integer id;

    private String toolNo;

    private Integer issueId;

    private String issueArea;

    private String notificationId;

    private String applyPersonName;

    private String applyPerson;

    private String processTool;

    private String processToolName;

    private String toolDutyPerson;

    private String toolDutyPersonName;

    private String reviewPerson;

    private String reviewPersonName;

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

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId == null ? null : notificationId.trim();
    }

    public String getApplyPersonName() {
        return applyPersonName;
    }

    public void setApplyPersonName(String applyPersonName) {
        this.applyPersonName = applyPersonName == null ? null : applyPersonName.trim();
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson == null ? null : applyPerson.trim();
    }

    public String getProcessTool() {
        return processTool;
    }

    public void setProcessTool(String processTool) {
        this.processTool = processTool == null ? null : processTool.trim();
    }

    public String getProcessToolName() {
        return processToolName;
    }

    public void setProcessToolName(String processToolName) {
        this.processToolName = processToolName == null ? null : processToolName.trim();
    }

    public String getToolDutyPerson() {
        return toolDutyPerson;
    }

    public void setToolDutyPerson(String toolDutyPerson) {
        this.toolDutyPerson = toolDutyPerson == null ? null : toolDutyPerson.trim();
    }

    public String getToolDutyPersonName() {
        return toolDutyPersonName;
    }

    public void setToolDutyPersonName(String toolDutyPersonName) {
        this.toolDutyPersonName = toolDutyPersonName == null ? null : toolDutyPersonName.trim();
    }

    public String getReviewPerson() {
        return reviewPerson;
    }

    public void setReviewPerson(String reviewPerson) {
        this.reviewPerson = reviewPerson == null ? null : reviewPerson.trim();
    }

    public String getReviewPersonName() {
        return reviewPersonName;
    }

    public void setReviewPersonName(String reviewPersonName) {
        this.reviewPersonName = reviewPersonName == null ? null : reviewPersonName.trim();
    }
}