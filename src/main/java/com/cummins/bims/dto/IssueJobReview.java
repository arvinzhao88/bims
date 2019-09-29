package com.cummins.bims.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class IssueJobReview implements Serializable {
    private Integer id;

    private Integer issueId;

    private Integer handlerDeptId;

    private String handlerDeptName;

    private Integer handlerPersonId;

    private String handlerPersonAccount;

    private String handlerPersonName;

    private String attment;

    private String measureAttment;

    private String measureText;

    private String reviewPerson;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reviewDate;

    private String conclusion;

    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private static final long serialVersionUID = 1L;

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

    public Integer getHandlerDeptId() {
        return handlerDeptId;
    }

    public void setHandlerDeptId(Integer handlerDeptId) {
        this.handlerDeptId = handlerDeptId;
    }

    public String getHandlerDeptName() {
        return handlerDeptName;
    }

    public void setHandlerDeptName(String handlerDeptName) {
        this.handlerDeptName = handlerDeptName == null ? null : handlerDeptName.trim();
    }

    public Integer getHandlerPersonId() {
        return handlerPersonId;
    }

    public void setHandlerPersonId(Integer handlerPersonId) {
        this.handlerPersonId = handlerPersonId;
    }

    public String getHandlerPersonAccount() {
        return handlerPersonAccount;
    }

    public void setHandlerPersonAccount(String handlerPersonAccount) {
        this.handlerPersonAccount = handlerPersonAccount == null ? null : handlerPersonAccount.trim();
    }

    public String getHandlerPersonName() {
        return handlerPersonName;
    }

    public void setHandlerPersonName(String handlerPersonName) {
        this.handlerPersonName = handlerPersonName == null ? null : handlerPersonName.trim();
    }

    public String getAttment() {
        return attment;
    }

    public void setAttment(String attment) {
        this.attment = attment == null ? null : attment.trim();
    }

    public String getMeasureAttment() {
        return measureAttment;
    }

    public void setMeasureAttment(String measureAttment) {
        this.measureAttment = measureAttment == null ? null : measureAttment.trim();
    }

    public String getMeasureText() {
        return measureText;
    }

    public void setMeasureText(String measureText) {
        this.measureText = measureText == null ? null : measureText.trim();
    }

    public String getReviewPerson() {
        return reviewPerson;
    }

    public void setReviewPerson(String reviewPerson) {
        this.reviewPerson = reviewPerson == null ? null : reviewPerson.trim();
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }
}