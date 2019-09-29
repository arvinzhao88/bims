package com.cummins.bims.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CarParam implements Serializable {
    private Integer id;

    private Integer issueId;

    private Integer toolId;

    private String carNo;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String sponsor;

    private String sponsorName;

    private String dutyDept;

    private String dutyPerson;

    private String dutyPersonName;

    private String carType;

    private String issueTitle;

    private Integer happenArea;

    private String stepOne;

    private Integer amount;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date aimCloseDate;

    private String stepTwo;

    private String breakpoint;

    private String improve;

    private String updateFile;

    private String rac;

    private String checkFile;

    private String esnForm;

    private String esnTo;

    private Integer esnFormNcmQt;

    private String dateForm;

    private String dateTo;

    private Integer dateFormNcmQty;

    private String mqv;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date completeDate;

    private Integer reviewStatus;

    private String reviewPerson;

    private String reviewPersonName;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reviewDate;

    private String picture;

    private String attachment;

    private List<CarExtend> ext;

    private String processPersonName;

    private String processPersonAccount;

    private String initPersonName;

    private String intPersonAccount;

    public String getProcessPersonName() {
        return processPersonName;
    }

    public void setProcessPersonName(String processPersonName) {
        this.processPersonName = processPersonName;
    }

    public String getProcessPersonAccount() {
        return processPersonAccount;
    }

    public void setProcessPersonAccount(String processPersonAccount) {
        this.processPersonAccount = processPersonAccount;
    }

    public String getInitPersonName() {
        return initPersonName;
    }

    public void setInitPersonName(String initPersonName) {
        this.initPersonName = initPersonName;
    }

    public String getIntPersonAccount() {
        return intPersonAccount;
    }

    public void setIntPersonAccount(String intPersonAccount) {
        this.intPersonAccount = intPersonAccount;
    }

    private static final long serialVersionUID = 1L;

    public List<CarExtend> getExt() {
        return ext;
    }

    public void setExt(List<CarExtend> ext) {
        this.ext = ext;
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

    public Integer getToolId() {
        return toolId;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName == null ? null : sponsorName.trim();
    }

    public String getDutyDept() {
        return dutyDept;
    }

    public void setDutyDept(String dutyDept) {
        this.dutyDept = dutyDept == null ? null : dutyDept.trim();
    }

    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    public String getDutyPersonName() {
        return dutyPersonName;
    }

    public void setDutyPersonName(String dutyPersonName) {
        this.dutyPersonName = dutyPersonName == null ? null : dutyPersonName.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle == null ? null : issueTitle.trim();
    }

    public Integer getHappenArea() {
        return happenArea;
    }

    public void setHappenArea(Integer happenArea) {
        this.happenArea = happenArea;
    }

    public String getStepOne() {
        return stepOne;
    }

    public void setStepOne(String stepOne) {
        this.stepOne = stepOne == null ? null : stepOne.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getAimCloseDate() {
        return aimCloseDate;
    }

    public void setAimCloseDate(Date aimCloseDate) {
        this.aimCloseDate = aimCloseDate;
    }

    public String getStepTwo() {
        return stepTwo;
    }

    public void setStepTwo(String stepTwo) {
        this.stepTwo = stepTwo == null ? null : stepTwo.trim();
    }

    public String getBreakpoint() {
        return breakpoint;
    }

    public void setBreakpoint(String breakpoint) {
        this.breakpoint = breakpoint == null ? null : breakpoint.trim();
    }

    public String getImprove() {
        return improve;
    }

    public void setImprove(String improve) {
        this.improve = improve == null ? null : improve.trim();
    }

    public String getUpdateFile() {
        return updateFile;
    }

    public void setUpdateFile(String updateFile) {
        this.updateFile = updateFile == null ? null : updateFile.trim();
    }

    public String getRac() {
        return rac;
    }

    public void setRac(String rac) {
        this.rac = rac == null ? null : rac.trim();
    }

    public String getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(String checkFile) {
        this.checkFile = checkFile == null ? null : checkFile.trim();
    }

    public String getEsnForm() {
        return esnForm;
    }

    public void setEsnForm(String esnForm) {
        this.esnForm = esnForm == null ? null : esnForm.trim();
    }

    public String getEsnTo() {
        return esnTo;
    }

    public void setEsnTo(String esnTo) {
        this.esnTo = esnTo == null ? null : esnTo.trim();
    }

    public Integer getEsnFormNcmQt() {
        return esnFormNcmQt;
    }

    public void setEsnFormNcmQt(Integer esnFormNcmQt) {
        this.esnFormNcmQt = esnFormNcmQt;
    }

    public String getDateForm() {
        return dateForm;
    }

    public void setDateForm(String dateForm) {
        this.dateForm = dateForm == null ? null : dateForm.trim();
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo == null ? null : dateTo.trim();
    }

    public Integer getDateFormNcmQty() {
        return dateFormNcmQty;
    }

    public void setDateFormNcmQty(Integer dateFormNcmQty) {
        this.dateFormNcmQty = dateFormNcmQty;
    }

    public String getMqv() {
        return mqv;
    }

    public void setMqv(String mqv) {
        this.mqv = mqv == null ? null : mqv.trim();
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewPerson() {
        return reviewPerson;
    }

    public void setReviewPerson(String reviewPerson) {
        this.reviewPerson = reviewPerson;
    }

    public String getReviewPersonName() {
        return reviewPersonName;
    }

    public void setReviewPersonName(String reviewPersonName) {
        this.reviewPersonName = reviewPersonName == null ? null : reviewPersonName.trim();
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}