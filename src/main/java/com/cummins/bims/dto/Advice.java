package com.cummins.bims.dto;

import java.io.Serializable;
import java.util.Date;

public class Advice implements Serializable {
    private Integer id;

    private Integer issueId;

    private Integer handlerDeptId;

    private String handlerDeptName;

    private Integer handlerPersonId;

    private String handlerPersonAccount;

    private String handlerPersonName;

    private Integer issueCategoryL1;

    private String issueCategoryL1Name;

    private Integer issueCategoryL2;

    private String issueCategoryL2Name;

    private String issueCategoryL3;

    private Date handlerDate;

    private String resolution;

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

    public Integer getIssueCategoryL1() {
        return issueCategoryL1;
    }

    public void setIssueCategoryL1(Integer issueCategoryL1) {
        this.issueCategoryL1 = issueCategoryL1;
    }

    public String getIssueCategoryL1Name() {
        return issueCategoryL1Name;
    }

    public void setIssueCategoryL1Name(String issueCategoryL1Name) {
        this.issueCategoryL1Name = issueCategoryL1Name == null ? null : issueCategoryL1Name.trim();
    }

    public Integer getIssueCategoryL2() {
        return issueCategoryL2;
    }

    public void setIssueCategoryL2(Integer issueCategoryL2) {
        this.issueCategoryL2 = issueCategoryL2;
    }

    public String getIssueCategoryL2Name() {
        return issueCategoryL2Name;
    }

    public void setIssueCategoryL2Name(String issueCategoryL2Name) {
        this.issueCategoryL2Name = issueCategoryL2Name == null ? null : issueCategoryL2Name.trim();
    }

    public String getIssueCategoryL3() {
        return issueCategoryL3;
    }

    public void setIssueCategoryL3(String issueCategoryL3) {
        this.issueCategoryL3 = issueCategoryL3 == null ? null : issueCategoryL3.trim();
    }

    public Date getHandlerDate() {
        return handlerDate;
    }

    public void setHandlerDate(Date handlerDate) {
        this.handlerDate = handlerDate;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }
}