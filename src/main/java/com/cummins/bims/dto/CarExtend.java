package com.cummins.bims.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CarExtend implements Serializable {
    private Integer id;

    private Integer carId;

    private String carStep;

    private String imageName;

    private String attachName;

    private String measure;

    private String thirdDutyPerson;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date thirdExecuteDate;

    private String reason;

    private String method;

    private String fourthDutyPerson;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fourthDate;

    private String conclusion;

    private String scheme;

    private String schemeResult;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fifthDate;

    private String action;

    private String lastScheme;

    private String sixthDutyPerson;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sixthDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sixthExecuteDate;

    private String sixthAttach;

    private String sixthAttachName;

    private String sixthAttachDesc;

    private String reportName;

    private String reportRemark;

    private static final long serialVersionUID = 1L;

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

    public String getCarStep() {
        return carStep;
    }

    public void setCarStep(String carStep) {
        this.carStep = carStep == null ? null : carStep.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName == null ? null : attachName.trim();
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public String getThirdDutyPerson() {
        return thirdDutyPerson;
    }

    public void setThirdDutyPerson(String thirdDutyPerson) {
        this.thirdDutyPerson = thirdDutyPerson == null ? null : thirdDutyPerson.trim();
    }

    public Date getThirdExecuteDate() {
        return thirdExecuteDate;
    }

    public void setThirdExecuteDate(Date thirdExecuteDate) {
        this.thirdExecuteDate = thirdExecuteDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getFourthDutyPerson() {
        return fourthDutyPerson;
    }

    public void setFourthDutyPerson(String fourthDutyPerson) {
        this.fourthDutyPerson = fourthDutyPerson == null ? null : fourthDutyPerson.trim();
    }

    public Date getFourthDate() {
        return fourthDate;
    }

    public void setFourthDate(Date fourthDate) {
        this.fourthDate = fourthDate;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme == null ? null : scheme.trim();
    }

    public String getSchemeResult() {
        return schemeResult;
    }

    public void setSchemeResult(String schemeResult) {
        this.schemeResult = schemeResult == null ? null : schemeResult.trim();
    }

    public Date getFifthDate() {
        return fifthDate;
    }

    public void setFifthDate(Date fifthDate) {
        this.fifthDate = fifthDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getLastScheme() {
        return lastScheme;
    }

    public void setLastScheme(String lastScheme) {
        this.lastScheme = lastScheme == null ? null : lastScheme.trim();
    }

    public String getSixthDutyPerson() {
        return sixthDutyPerson;
    }

    public void setSixthDutyPerson(String sixthDutyPerson) {
        this.sixthDutyPerson = sixthDutyPerson == null ? null : sixthDutyPerson.trim();
    }

    public Date getSixthDate() {
        return sixthDate;
    }

    public void setSixthDate(Date sixthDate) {
        this.sixthDate = sixthDate;
    }

    public Date getSixthExecuteDate() {
        return sixthExecuteDate;
    }

    public void setSixthExecuteDate(Date sixthExecuteDate) {
        this.sixthExecuteDate = sixthExecuteDate;
    }

    public String getSixthAttach() {
        return sixthAttach;
    }

    public void setSixthAttach(String sixthAttach) {
        this.sixthAttach = sixthAttach == null ? null : sixthAttach.trim();
    }

    public String getSixthAttachName() {
        return sixthAttachName;
    }

    public void setSixthAttachName(String sixthAttachName) {
        this.sixthAttachName = sixthAttachName == null ? null : sixthAttachName.trim();
    }

    public String getSixthAttachDesc() {
        return sixthAttachDesc;
    }

    public void setSixthAttachDesc(String sixthAttachDesc) {
        this.sixthAttachDesc = sixthAttachDesc == null ? null : sixthAttachDesc.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getReportRemark() {
        return reportRemark;
    }

    public void setReportRemark(String reportRemark) {
        this.reportRemark = reportRemark == null ? null : reportRemark.trim();
    }
}